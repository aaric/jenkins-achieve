package com.github.aaric.achieve.jenkins.utils;

import java.text.MessageFormat;

/**
 * CSV工具类
 *
 * @author Aaric, created on 2018-05-12T10:47.
 * @since 0.1.0-SNAPSHOT
 */
public class CSVUtil {

    public static String sayHello(String name) {
        return MessageFormat.format("Hello, {0}!", name);
    }
}
