package com.company.socket.server;

/**
 * com.company.socket
 *
 * @author Wang
 * @create 2018-01-19 下午7:15
 * @description:
 **/


import com.company.common.util.RegexUtil;
import com.company.restapi.dao.DeviceOfflineInfoMapper;
import com.company.restapi.model.DeviceOfflineInfo;
import com.company.restapi.service.DeviceService;
import com.company.restapi.web.AppDeviceController;
import com.company.socket.service.DeviceSocketService;
import com.sun.media.jfxmedia.logging.Logger;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.util.CharsetUtil;
import io.netty.util.ReferenceCountUtil;
import org.apache.ibatis.annotations.Case;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.net.SocketAddress;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Handles a server-side channel.
 */
@Component
public class DiscardServerHandler extends SimpleChannelInboundHandler<ByteBuf> { // (1)
    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(AppDeviceController.class);

    @Resource
    private DeviceSocketService deviceSocketService;

    @Resource
    private RedisTemplate redisTemplate;

    @Override
    public void channelRead0(ChannelHandlerContext ctx, ByteBuf in) {

        SocketAddress socketAddress = ctx.channel().remoteAddress();
        redisTemplate.opsForValue().set(socketAddress,ctx);
        System.out.println(socketAddress);
        System.out.println(in.toString(CharsetUtil.UTF_8));

        String s1 = in.toString(CharsetUtil.UTF_8);
        String[] split = s1.split("[/</>]");
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();

        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals("")) {
                objectObjectHashMap.put(RegexUtil.getCmdTitle(split[i]), split[i]);
            }
        }
        //map 中都是有值的
        for (Object o : objectObjectHashMap.keySet()) {
            System.out.print(o + ":");
            System.out.println(objectObjectHashMap.get(o));
            switch (o.toString()) {
                //心跳包
                case "xtpc":
                    System.out.println("xtpc");
                    logger.info("处理心跳包");
                    deviceSocketService.handHeartbeat((String)objectObjectHashMap.get(o));
                    break;
                //设备类型
                case "asdev":
                    System.out.println("asdev");
                    logger.info("处理设备类型");
                    String returnString = null;
                    try {
                        returnString = deviceSocketService.handleDeviceType((String)objectObjectHashMap.get(o));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    ctx.writeAndFlush(Unpooled.copiedBuffer(returnString, CharsetUtil.UTF_8));

                   break;
                // 出水方式
                case "woty":
                    System.out.println("woty");
                    logger.info("处理出水方式");
                    String s = deviceSocketService.handleFlowType((String) objectObjectHashMap.get(o));
                    ctx.writeAndFlush(Unpooled.copiedBuffer(s, CharsetUtil.UTF_8));
                    break;
                // 预约改变状态准备中
                case "wyuy":
                    System.out.println("wyuy");
                    System.out.println("------------");
                    break;
                // 出水方式主动上报
                case "asoty":
                    System.out.println("asoty");
                    System.out.println("------------");
                    break;
                // 出水模式
                case "womd":
                    System.out.println("womd");
                    System.out.println("------------");
                    break;
                // 出水模式主动上报
                case "asomd":
                    System.out.println("asomd");
                    System.out.println("------------");
                    break;
                // 温度流量液晶
                case "asdft":
                    System.out.println("asdft");
                    System.out.println("------------");
                    break;
                // 背光
                case "asbltr":
                    System.out.println("asbltr");
                    System.out.println("------------");
                    break;
                // 背光APP设置
                case "bltr":
                    System.out.println("bltr");
                    System.out.println("------------");
                    break;
                // 洗澡时间
                case "asxzsj":
                    System.out.println("asxzsj");
                    System.out.println("------------");
                    break;
                // 泵
                case "aspump":
                    System.out.println("aspump");
                    System.out.println("------------");
                    break;
                // 定时定量
                case "dsdl":
                    System.out.println("dsdl");
                    System.out.println("------------");
                    break;
                // 上传异常
                case "scyc":
                    System.out.println("scyc");
                    System.out.println("------------");
                    break;
                // app禁用
                case "akgapp":
                    System.out.println("akgapp");
                    System.out.println("------------");
                    break;
                // 固件版本
                case "verx":
                    System.out.println("verx");
                    System.out.println("------------");
                    break;
                // 实时数据
                case "real":
                    System.out.println("real");
                    System.out.println("------------");
                    break;
                //每次洗澡用水量节水量
                case "scwt":
                    System.out.println("scwt");
                    System.out.println("------------");
                    break;
                //语音播报开关，音量app设置
                case "yyos":
                    System.out.println("yyos");
                    System.out.println("------------");
                    break;
                // 音量液晶屏设置
                case "asyyos":
                    System.out.println("asyyos");
                    System.out.println("------------");
                    break;
                //设定温度
                case "wdft":
                    System.out.println("wdft");
                    System.out.println("------------");
                    break;
                //待机
                case "daij":
                    System.out.println("daij");
                    System.out.println("------------");
                    break;
                // 开始暂停控制
                case "kszt":
                    System.out.println("kszt");
                    System.out.println("------------");
                    break;
                // 开始暂停主动上报
                case "askazt":
                    System.out.println("askazt");
                    System.out.println("------------");
                    break;
                // 设备初始化
                case "init":
                    System.out.println("init");
                    System.out.println("------------");
                    break;
                // 温度流量计校准
                case "wcal":
                    System.out.println("wcal");
                    System.out.println("------------");
                    break;
                default:
                    System.out.println("上传信令错误...");
            }
        }


    }


    @Override
    public void channelReadComplete(ChannelHandlerContext ctx)
            throws Exception {
        ctx.writeAndFlush(Unpooled.EMPTY_BUFFER)
                .addListener(ChannelFutureListener.CLOSE);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx,
                                Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }

}
