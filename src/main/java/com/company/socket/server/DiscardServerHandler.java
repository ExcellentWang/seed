package com.company.socket.server;

/**
 * com.company.socket
 *
 * @author Wang
 * @create 2018-01-19 下午7:15
 * @description:
 **/


import com.company.restapi.dao.DeviceOfflineInfoMapper;
import com.company.restapi.model.DeviceOfflineInfo;
import com.company.restapi.service.DeviceService;
import com.sun.media.jfxmedia.logging.Logger;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.util.CharsetUtil;
import io.netty.util.ReferenceCountUtil;
import org.apache.ibatis.annotations.Case;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.util.Date;
import java.util.HashMap;

/**
 * Handles a server-side channel.
 */
@Component
public class DiscardServerHandler extends ChannelInboundHandlerAdapter { // (1)

    @Resource
    private DeviceService deviceService;
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        ByteBuf in = (ByteBuf) msg;
        System.out.println(
                "Server received: " + in.toString(CharsetUtil.UTF_8));
        //分解字符串形成map
        String s = "<LDCT01201704230001:xtpc,032,OR>";
        String[] split = s.split("[/:/,/</>]");
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        for (int i =0; i< split.length;i++) {
            objectObjectHashMap.put(i,split[i]);
        }
        for (Object o : objectObjectHashMap.keySet()) {
            System.out.println(o);
            System.out.println(objectObjectHashMap.get(o));
        }

        switch (objectObjectHashMap.get(1).toString())
        {
            //心跳包
            case "xtpc":
               boolean b =  deviceService.handHeartbeat(objectObjectHashMap);
            default:
        }


//        ctx.write(in);
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
