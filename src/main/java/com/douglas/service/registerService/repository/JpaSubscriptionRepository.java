package com.douglas.service.registerService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglas.service.registerService.entities.SubscriptionEntity;
import java.lang.String;
import java.util.List;

public interface JpaSubscriptionRepository extends JpaRepository<SubscriptionEntity, Long>{
	
	
	 List<SubscriptionEntity> findByEmail(String email);
}
