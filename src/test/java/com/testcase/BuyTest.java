package com.testcase;

import org.junit.Test;

/**
 * @auther liuliuliu
 * @date 2021/6/22
 **/
public class BuyTest extends BaseTest{
    @Test
    public void buy(){
        if (dateMap.get("login").equals("登录成功")){
            System.out.println("登录成功，可以购买");
    }else {
            System.out.println("没有登录，需要登录成功才能购买");
        }
    }
}
