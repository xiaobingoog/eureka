package com.zengjh.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description: eureka启动类
 * @ClassName: EurekaServerApp9502
 * @author: xiaobingoog
 * @date: 2022/4/16 18:07
 * @version: 1.0.1
 * @since: JDK 1.8
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApp9502 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApp9502.class, args);
    }
}
