package com.app.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.microservices.limitsservice.bean.LimitConfiguration;
import com.app.microservices.limitsservice.configuration.Configuration;



@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration config;


	@GetMapping("/limits")
	public LimitConfiguration retrieveConfigurationLimits(){

		return new LimitConfiguration(config.getMinimum(),config.getMaximum());
	}

}
