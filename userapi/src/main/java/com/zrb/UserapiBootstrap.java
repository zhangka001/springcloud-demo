package com.zrb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author Ruibiao Zhang, <rbzhang@mobvoi.com>
 * @Date 2018/9/2
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserapiBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(UserapiBootstrap.class,args);
    }
}
