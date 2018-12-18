package com.douglas.service.registerService.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.douglas.service.registerService.entities.SubscriptionEntity;

@RestController
public interface ISubscriptorResource {

	@CrossOrigin
	@PostMapping("/subscriptor")
	public ResponseEntity<SubscriptionEntity> registerSubscription(@RequestHeader("ADIDAS-Auth-Token") String authToken,@RequestBody SubscriptionEntity subscription);
	

}
