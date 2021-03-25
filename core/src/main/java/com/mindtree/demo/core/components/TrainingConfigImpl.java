package com.mindtree.demo.core.components;

import org.apache.sling.commons.osgi.PropertiesUtil;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = TrainingConfig.class, immediate = true)
@Designate(ocd = TrainingFactoryConfig.class, factory = true)
public class TrainingConfigImpl implements TrainingConfig {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());

	private String data;

	private TrainingFactoryConfig config;

	@Activate
	@Modified
	protected void activate(final TrainingFactoryConfig config) {
		this.data = PropertiesUtil.toString(config.filePath() + "-" + config.gender()+"-"+ config.checkbox() ,
				"No config found");

		logger.info("Read the dummy property value " + data);
		this.config = config;
	}
	
	

	@Override
	public String getFilePath() {
		// TODO Auto-generated method stub
		return config.filePath();
	}

	@Override
	public String getGender() {
		// TODO Auto-generated method stub
		return config.gender();
	}

	@Override
	public boolean getCheckbox() {
		// TODO Auto-generated method stub
		return config.checkbox();
	}

}
