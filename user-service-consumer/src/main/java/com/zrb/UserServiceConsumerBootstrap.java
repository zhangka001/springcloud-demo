package com.zrb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author Ruibiao Zhang, <rbzhang@mobvoi.com>
 * @Date 2018/9/2
 */

@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceConsumerBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceConsumerBootstrap.class,args);
    }
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}