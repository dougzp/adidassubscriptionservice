package com.douglas.service.registerService.SubcriptionRegister;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.douglas.service.registerService.entities.SubscriptionEntity;
import com.douglas.service.registerService.repository.JpaSubscriptionRepository;
import com.douglas.service.registerService.service.ISubscriptionService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SubcriptionRegisterApplicationTests {
	@Autowired
	private ISubscriptionService service;
	
	@Autowired	
	private JpaSubscriptionRepository repostiory;

	@Test
	public void checkDataBaseRegisters() {
		
		assertTrue(service.findAll().isEmpty());		
		
		repostiory.save(new SubscriptionEntity("dougzp@gmail.com","dougzp@gmail.com", new Date(), "Male", true));
		repostiory.save(new SubscriptionEntity("dougteste@gmail.com","dougzp@gmail.com", new Date(), "Male", true));
		
		assertTrue(service.findAll().size()==2);	
		
	}

}

