package com.Jcn;

import org.junit.Assert;
import org.junit.Test;

public class TestHelloMaven {

    @Test
    public void testAdd(){
        System.out.println("=======testADD测试方法====");
        HelloMaven hello = new HelloMaven();
        int res =hello.add(10,20);
        Assert.assertEquals(30,res);
    }
}
