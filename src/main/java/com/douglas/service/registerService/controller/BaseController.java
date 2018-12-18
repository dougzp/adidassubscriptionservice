package com.douglas.service.registerService.controller;

import org.springframework.web.bind.annotation.RequestHeader;

public abstract class BaseController {

   
    public boolean checkAuthHeader(
            @RequestHeader("ADIDAS-Auth-Token") String authToken) {
        if (!"TOKEN_ADIDAS_AUTH".equals(authToken)) {
        	return false;
        }
        return true;      
    }
}
