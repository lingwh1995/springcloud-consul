package org.openatom.springcloud.service;

import org.apache.ibatis.annotations.Param;
import org.openatom.springcloud.entities.Payment;

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
