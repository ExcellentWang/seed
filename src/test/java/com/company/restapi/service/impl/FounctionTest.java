package com.company.restapi.service.impl;

import com.company.common.util.Md5Util;
import com.company.common.util.RegexUtil;
import com.company.restapi.model.DeviceMsg;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.assertj.core.error.ShouldHaveOnlyElementsOfType;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * com.company.restapi.service.impl
 *
 * @author Wang
 * @create 2018-01-23 下午7:48
 * @description:
 **/
public class FounctionTest {
    int i;

    @Test
    public void testMyidea() {

        System.out.println(i);
    }

    @Test
    public void testMd5() {
        int i = 0000;
        String md5String = Md5Util.getMD5String(Integer.toString(i));
        System.out.println(md5String);
    }

    @Test
    public void testRegex() {
        String s = "<LDCT01201704230001:xtpc,032,OR>" +
                "<LDCT01201704230001:asdev,032,OR>" +
                "<LDCT01201704230001:woty,032,OR>" +
                "<LDCT01201704230001:wyuy,032,OR>" +
                "<LDCT01201704230001:asoty,032,OR>" +
                "<LDCT01201704230001:womd,032,OR>" +
                "<LDCT01201704230001:asomd,032,OR>" +
                "<LDCT01201704230001:asdft,032,OR>" +
                "<LDCT01201704230001:asbltr,032,OR>" +
                "<LDCT01201704230001:bltr,032,OR>" +
                "<LDCT01201704230001:asxzsj,032,OR>" +
                "<LDCT01201704230001:aspump,032,OR>" +
                "<LDCT01201704230001:dsdl,032,OR>" +
                "<LDCT01201704230001:scyc,032,OR>" +
                "<LDCT01201704230001:akgapp,032,OR>" +
                "<LDCT01201704230001:verx,032,OR>" +
                "<LDCT01201704230001:real,032,OR>" +
                "<LDCT01201704230001:scwt,032,OR>" +
                "<LDCT01201704230001:yyos,032,OR>" +
                "<LDCT01201704230001:asyyos,032,OR>" +
//                "<LDCT01201704230001:wdft,032,OR>" +
                "<LDCT01201704230001:daij,032,OR>" +
                "<LDCT01201704230001:kszt,032,OR>" +
                "<LDCT01201704230001:askazt,032,OR>" +
//                "<LDCT01201704230001:init,032,OR>" +
                "<LDCT01201704230001:wcal,032,OR>";
//        String[] split = s.split("[/LDCT/:/,/</>]");
        String[] split = s.split("[/</>]");
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
                case "xtpc":
                    System.out.println("xtpc");
                    System.out.println("----------");
                    break;
                case "asdev":
                    System.out.println("asdev");
                    System.out.println("------------");

                    String s1 = (String) objectObjectHashMap.get(o);
                    String[] split1 = s1.split("[/:/,]");
                    for (int i = 0; i < split1.length; i++) {

                    }
                    break;

                // 出水方式
                case "woty":
                    System.out.println("woty");
                    System.out.println("------------");
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

    @Test
    public void tsetList(){
        DeviceMsg deviceMsg = new DeviceMsg();
        String s = "LDCT01201704230001:xtpc,032,99,00,uuu,ooo,yyy,OR";
        String[] split = s.split("[/:/,]");
        String[] strings = Arrays.copyOfRange(split, 3, split.length - 1);
        deviceMsg.setCmdArgs(Arrays.asList(strings));
        for (String s1 : deviceMsg.getCmdArgs()) {
            System.out.println(s1);
        }


    }
}


