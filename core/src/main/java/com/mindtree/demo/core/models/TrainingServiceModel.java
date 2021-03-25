package com.mindtree.demo.core.models;

import javax.annotation.PostConstruct
;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

import com.mindtree.demo.core.components.TrainingConfig;

@Model(adaptables=Resource.class)
public class TrainingServiceModel {
	
	@OSGiService
	private TrainingConfig trainingConfig;
	
	String filepath;
	String gender;
	boolean checkbox;
	
	@PostConstruct
	protected void init() {
		//message=orchardService.getMessage();
		filepath=trainingConfig.getFilePath();
		gender=trainingConfig.getGender();
		checkbox=trainingConfig.getCheckbox();
	}

	public String getFilepath() {
		return filepath;
	}

	public String getGender() {
		return gender;
	}

	public boolean isCheckbox() {
		return checkbox;
	}
	
	
}
