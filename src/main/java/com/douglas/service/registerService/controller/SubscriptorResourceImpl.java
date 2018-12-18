package com.douglas.service.registerService.controller;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.douglas.service.registerService.entities.SubscriptionEntity;
import com.douglas.service.registerService.service.ISubscriptionService;
import com.netflix.discovery.EurekaClient;


@RestController
public class SubscriptorResourceImpl extends  BaseController implements ISubscriptorResource{
	
	
	@Autowired
	@Lazy
	private EurekaClient eurekaClient;

	@Value("${spring.application.name}")
	private String appName;
	
	@Autowired
	private ISubscriptionService service;
	
	
	@Override
	public ResponseEntity<SubscriptionEntity> registerSubscription(@RequestHeader("ADIDAS-Auth-Token") String authToken, @RequestBody SubscriptionEntity susbsriptor_) {

		if(!checkAuthHeader(authToken)) {
			return new ResponseEntity<SubscriptionEntity>(HttpStatus.UNAUTHORIZED);
		}
		
		try {
			List<SubscriptionEntity>  listSubscriptionResult = service.findByEmail(susbsriptor_.getEmail());
			if(listSubscriptionResult !=null && !listSubscriptionResult.isEmpty()) {
				 SubscriptionEntity subscriptionResul = new SubscriptionEntity();
				 subscriptionResul.setErroMessage(susbsriptor_.getEmail()+" already register");
				return new ResponseEntity<SubscriptionEntity>(subscriptionResul,HttpStatus.UNPROCESSABLE_ENTITY);
			 }
			  SubscriptionEntity subscriptionResult = service.registerSubscription(susbsriptor_);

			return new ResponseEntity<SubscriptionEntity>(subscriptionResult, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<SubscriptionEntity>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
