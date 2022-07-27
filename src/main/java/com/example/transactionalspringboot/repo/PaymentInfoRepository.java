package com.example.transactionalspringboot.repo;

import com.example.transactionalspringboot.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo,String> {
}
