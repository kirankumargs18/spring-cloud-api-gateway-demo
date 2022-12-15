package com.globallogic.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Value("${server.port}")
	private String port;

	@GetMapping("/info")
	public ResponseEntity<String> showPaymentInfo() {
		return ResponseEntity.ok("From Payment Service, Port# is " + port);
	}

}
