package com.example.transactionalspringboot.dto;


import com.example.transactionalspringboot.entity.PassengerInfo;
import com.example.transactionalspringboot.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {

    private PassengerInfo passengerInfo;

    private PaymentInfo paymentInfo;
}
