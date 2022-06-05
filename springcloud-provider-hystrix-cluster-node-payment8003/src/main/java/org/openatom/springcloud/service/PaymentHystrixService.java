package org.openatom.springcloud.service;

import org.apache.ibatis.annotations.Param;
import org.openatom.springcloud.entities.Payment;

public interface PaymentHystrixService {
    /**
     * 没有进行服务降级和服务熔断的方法
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 没有进行服务降级和服务熔断的方法
     * @param id
     * @return
     */
    Payment getPaymentByIdOk(@Param("id") Long id);

    /**
     * 没有进行服务降级和服务熔断的方法
      * @param id
     * @return
     */
    Payment getPaymentByIdTimeout(@Param("id") Long id);

    /**
     * 测试服务降级的方法
     * @param id
     * @return
     */
    Payment getPaymentByIdUseHystrixDegradation(@Param("id") Long id);

    /**
     * 测试服务熔断的方法
     * @param id
     * @return
     */
    Payment getPaymentByIdUseHystrixCircuitBreaker(@Param("id") Long id);
}
