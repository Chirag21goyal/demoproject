package com.mindtree.demo.core.models;

import javax.inject.Inject;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL )
public class ObsText{

	@Inject
	String title;
	
	@Inject
	String type;

	public String getTitle() {
		return title;
	}

	public String getType() {
		return type;
	}


	
	
}
