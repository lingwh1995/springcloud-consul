package org.openatom.springcloud.config;

import feign.Logger;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
public class FeignConfig {

    /**
     * 创建重试器 （重试周期（50毫秒），最大重试周期（2000毫秒），最多尝试次数 6次 ）
     * feign没有采用线性的重试机制而是采用的是一种指数级（乘法）的重试机制 每次重试时间  当前重试时间*= 1.5
     * @FeignClient(value = "Eureka-client", configuration = FeignConfig.class) 进行配置
     * @return
     */
    @Bean
    public Retryer getRetryer() {
        return new Retryer.Default(50, TimeUnit.SECONDS.toMillis(2), 6);
    }

    /**
     * NONE：默认的，不显示任何日志;
     * BASIC：仅记录请求方法、URL、响应状态码及执行时间;
     * HEADERS：除了BASIC中定义的信息之外，还有请求和响应的头信息;
     * FULL：除了HEADERS中定义的信息之外，还有请求和响应的正文及元数据。
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
