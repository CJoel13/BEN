package com.udemy.backendNinja.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.udemy.backendNinja.service.ServiceExample;
import com.udemy.backendNinja.service.ServiceExample2;

@Service
public class ServiceExampleImpl implements ServiceExample, ServiceExample2{
	
	private static final Log LOG = LogFactory.getLog(ServiceExampleImpl.class);
	
	@Override
	public String serviceMethod() {
		LOG.info("Hola desde Servicio");
		return "Hola";
	}

	@Override
	public String service_method_2() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
