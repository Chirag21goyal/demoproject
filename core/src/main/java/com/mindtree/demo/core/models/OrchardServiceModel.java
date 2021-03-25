package com.mindtree.demo.core.models;

import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

import com.mindtree.demo.core.components.OrchardConfig;
//import com.mindtree.demo.core.services.OrchardService;

@Model(adaptables=Resource.class)
public class OrchardServiceModel {
	
	//@OSGiService
	//private OrchardService orchardService;
	
	@OSGiService
	private OrchardConfig orchardConfig;
	
	String dime1;
	String dime2;
	
	//String message;
	
	@PostConstruct
	protected void init() {
		//message=orchardService.getMessage();
		dime1=orchardConfig.getDimensionOne();
		dime2=orchardConfig.getDimensionTwo();
	}

	public String getDime1() {
		return dime1;
	}

	public String getDime2() {
		return dime2;
	}

	//public String getMessage() {
		//return message;
	//}
}
