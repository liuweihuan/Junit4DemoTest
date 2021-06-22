package com.suiteDemo;

import com.testcase.BuyTest;
import com.testcase.LoginTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @auther liuliuliu
 * @date 2021/6/22
 **/
@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoginTest.class,
        BuyTest.class
})
public class SuiteDemoTest {

}
