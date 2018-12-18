package com.douglas.service.registerService.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.douglas.service.registerService.entities.SubscriptionEntity;

@Component
public interface ISubscriptionService {
	

	public List<SubscriptionEntity> findByEmail(String email);
	public List<SubscriptionEntity> findAll();
	public SubscriptionEntity registerSubscription(SubscriptionEntity entity);

}
