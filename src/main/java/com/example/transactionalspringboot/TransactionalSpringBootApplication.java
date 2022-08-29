package com.example.transactionalspringboot;

import com.example.transactionalspringboot.dto.FlightBookingAcknowledgement;
import com.example.transactionalspringboot.dto.FlightBookingRequest;
import com.example.transactionalspringboot.exception.InsufficientAmountException;
import com.example.transactionalspringboot.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@SpringBootApplication
@RestController
@EnableTransactionManagement
public class TransactionalSpringBootApplication {

	@Autowired
	private FlightBookingService service;


	@PostMapping("/bookFlightTicket")
	public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request) {
		return service.bookFlightTicket(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(TransactionalSpringBootApplication.class, args);
	}

}
