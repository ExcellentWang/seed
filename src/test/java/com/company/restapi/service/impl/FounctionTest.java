package com.company.restapi.service.impl;

import com.company.common.util.Md5Util;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.assertj.core.error.ShouldHaveOnlyElementsOfType;
import org.junit.Test;

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
    int i ;
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
        String s = "<LDCT01201704230001:xtpc,032,OR>";
        String[] split = s.split("[/LDCT/:/,/</>]");
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        for (int i =0; i< split.length;i++) {
            objectObjectHashMap.put(i,split[i]);
        }
        for (Object o : objectObjectHashMap.keySet()) {
            System.out.println(o);
            System.out.println(objectObjectHashMap.get(o));
        }


    }

}


