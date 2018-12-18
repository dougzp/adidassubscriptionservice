package com.douglas.service.registerService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.douglas.service.registerService.entities.SubscriptionEntity;
import com.douglas.service.registerService.repository.JpaSubscriptionRepository;

@Service
public class SubscriptionService implements ISubscriptionService {

	
	private JpaSubscriptionRepository repostiory;
	
	
	public SubscriptionService(JpaSubscriptionRepository repostiory) {
		this.repostiory = repostiory;
	}
	
	
	@Override
	public List<SubscriptionEntity> findByEmail(String email) {
			return repostiory.findByEmail(email);
	}

	@Override
	public SubscriptionEntity registerSubscription(SubscriptionEntity entity) {
				
		return repostiory.save(entity);
	}


	@Override
	public List<SubscriptionEntity> findAll() {
	
		return repostiory.findAll();
	}
	
	

	

}
