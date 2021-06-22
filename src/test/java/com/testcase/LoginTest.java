package com.testcase;

import org.junit.Test;

/**
 * @auther liuliuliu
 * @date 2021/6/22
 **/
public class LoginTest extends BaseTest{
    @Test
    public void login(){
        dateMap.put("login","登录成功");
        System.out.println(dateMap.get("login"));
    }
}
