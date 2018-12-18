package com.douglas.service.registerService.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class SubscriptionEntity {
	
	@Id
	@GeneratedValue
	private Long id;
	private String email = null;
    private String firstName = null;
 	private Date dateOfBith = null;
	private String gender = null;
	private Boolean consent = null;
	
	@Transient
	private String erroMessage;
	
	
	public SubscriptionEntity() {
	
	}



	public SubscriptionEntity(String email, String firstName, Date dateOfBith, String gender, Boolean consent) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.dateOfBith = dateOfBith;
		this.gender = gender;
		this.consent = consent;
	}


	public SubscriptionEntity(Long id, String email, String firstName, Date dateOfBith, String gender, Boolean consent) {
		super();
		this.id=id;
		this.email = email;
		this.firstName = firstName;
		this.dateOfBith = dateOfBith;
		this.gender = gender;
		this.consent = consent;
	}
	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public Date getDateOfBith() {
		return dateOfBith;
	}



	public void setDateOfBith(Date dateOfBith) {
		this.dateOfBith = dateOfBith;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public Boolean getConsent() {
		return consent;
	}



	public void setConsent(Boolean consent) {
		this.consent = consent;
	}



	public String getErroMessage() {
		return erroMessage;
	}



	public void setErroMessage(String erroMessage) {
		this.erroMessage = erroMessage;
	}

	

	

	
	
}
