package com.company.common.util;

import com.company.restapi.model.DeviceMsg;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * com.company.common.util
 *
 * @author Wang
 * @create 2018-02-05 下午7:33
 * @description:
 **/
public class DeviceMsgUtils {
    public static DeviceMsg generateDeviceMsg(String stringMsg) {
        String[] split = stringMsg.split("[/:/,]");

        List<String> strings = Arrays.asList(Arrays.copyOfRange(split, 3, split.length - 1));
        for (String s : Arrays.asList(Arrays.copyOfRange(split, 3, split.length - 1))) {
            System.out.println(s);
        }
        return new DeviceMsg()
               .setDeviceNum(split[0])
                .setCmdTitle(split[1])
                .setCmdArgs(strings)
                .setCheckMsg(split[split.length-1]);
    }
}
