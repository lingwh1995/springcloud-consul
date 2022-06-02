package org.openatom.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 支付接口提供者
 *  使用Eureka作为注册中心
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableCircuitBreaker//服务提供方端启用Hystrix
public class PaymentServiceProviderHystrixClusterNode8003 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentServiceProviderHystrixClusterNode8003.class, args);
    }
}
