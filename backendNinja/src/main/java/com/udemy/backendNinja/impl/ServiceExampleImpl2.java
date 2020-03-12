package com.udemy.backendNinja.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.udemy.backendNinja.service.ServiceExample;

@Service
@Primary
public class ServiceExampleImpl2 implements ServiceExample{
	
	private static final Log LOG = LogFactory.getLog(ServiceExampleImpl2.class);
	
	@Override
	public String serviceMethod() {
		LOG.info("Hola desde implementacion 2");
		return "Hola2";
	}

}
