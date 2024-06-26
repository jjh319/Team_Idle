package com.idle.shoppingmall.mapper;

import com.idle.shoppingmall.Entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PaymentMapper {
    Long savePayment(@Param("payment") Payment payment);

    Payment findById(Long paymentId);

    Integer delete(Long paymentId);
}
