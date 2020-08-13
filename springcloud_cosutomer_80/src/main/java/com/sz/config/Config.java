package com.sz.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config{      //为客户端提供的一个更高包装的rest模板

    @Bean
    @Primary     //注意，必须使用该注解，不然报找不到服务
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
