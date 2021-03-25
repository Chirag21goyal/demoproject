package com.mindtree.demo.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//immediate = true(active status) and immediate = false(satisfied status)
@Component(service=OrchardService.class, immediate = true)
public class OrchardServiceImpl implements OrchardService{

	private final Logger logger = LoggerFactory.getLogger(getClass());
	@Override
	public String getMessage() {
		
		return "welcome to possible";
	}

	@Activate
	@Modified
	protected void anyThing()
	{
		logger.info("this is osgi service");
	}
}
