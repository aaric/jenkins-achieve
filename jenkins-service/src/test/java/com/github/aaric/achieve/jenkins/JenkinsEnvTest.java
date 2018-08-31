package com.github.aaric.achieve.jenkins;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * JenkinsEnvTest
 *
 * @author Aaric, created on 2018-08-31T16:53.
 * @since 0.2.1-SNAPSHOT
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class JenkinsEnvTest extends AbstractJUnit4SpringContextTests {

    @Value("${jenkins.version}")
    private String jenkinsVersion;

    @Test
    public void testCheckVersion() {
        System.out.println("JENKINS_VERSION: " + jenkinsVersion);
        Assert.assertNotEquals("NotProvided", jenkinsVersion);
    }
}
