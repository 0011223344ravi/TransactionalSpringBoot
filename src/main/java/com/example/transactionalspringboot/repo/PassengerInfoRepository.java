package com.example.transactionalspringboot.repo;

import com.example.transactionalspringboot.entity.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo, Integer> {
}
