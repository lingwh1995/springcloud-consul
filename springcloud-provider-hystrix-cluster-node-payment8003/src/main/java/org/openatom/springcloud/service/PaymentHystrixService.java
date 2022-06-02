package org.openatom.springcloud.service;

import org.apache.ibatis.annotations.Param;
import org.openatom.springcloud.entities.Payment;

public interface PaymentHystrixService {

    int create(Payment payment);
    Payment getPaymentByIdOk(@Param("id") Long id);
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
