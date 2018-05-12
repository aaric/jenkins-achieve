package com.github.aaric.achieve.jenkins.utils;

import org.junit.Assert;
import org.junit.Test;

/**
 * CSVUtilTest
 *
 * @author Aaric, created on 2018-05-12T10:49.
 * @since 0.1.0-SNAPSHOT
 */
public class CSVUtilTest {

    @Test
    public void testSayHello() {
        Assert.assertEquals("Hello, Aaric!", CSVUtil.sayHello("Aaric"));
    }
}
