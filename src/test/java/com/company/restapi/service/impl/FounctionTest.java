package com.company.restapi.service.impl;

import com.company.common.util.Md5Util;
import org.junit.Test;

/**
 * com.company.restapi.service.impl
 *
 * @author Wang
 * @create 2018-01-23 下午7:48
 * @description:
 **/
public class FounctionTest {
    @Test
    public  void testMyidea(){

        Integer i = 88888;
        System.out.println(i.toString());
    }
    @Test
    public void testMd5(){
        int i = 0000;
        String md5String = Md5Util.getMD5String(Integer.toString(i));
        System.out.println(md5String);
    }
}
