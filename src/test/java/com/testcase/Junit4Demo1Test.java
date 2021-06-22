package com.testcase;

import org.junit.*;

/**
 * @auther liuliuliu
 * @date 2021/6/20
 **/
public class Junit4Demo1Test {
    @BeforeClass
    public static void beforeclass() {
        System.out.println("beforeclass test");
    }

    @Before
    public void before() {
        System.out.println("before");
    }

    @Test
    //标记一个方法可以做为测试类
    public void fun1() {
        System.out.println("fun1 test1");

    }

    @Test
    public void fun2() {
        System.out.println("fun2 test2");

    }

    @Test
    @Ignore
    //@Ignore 忽略该条用例
    public void fun3(){
        System.out.println("fun3 test3");
    }

    @After
    public void after() {
        System.out.println("after");
    }

    @AfterClass
    public static void afterclass() {
        System.out.println("afterclass test");
    }


}
