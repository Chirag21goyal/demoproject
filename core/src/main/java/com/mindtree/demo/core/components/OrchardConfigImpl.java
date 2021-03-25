package com.mindtree.demo.core.components;

import org.apache.sling.commons.osgi.PropertiesUtil;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = OrchardConfig.class, immediate = true)
@Designate(ocd = OrchardFactoryConfig.class, factory = true)
public class OrchardConfigImpl implements OrchardConfig {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	private String data;

	private OrchardFactoryConfig orchardFactoryConfig;

	@Activate
	@Modified
	protected void activate(final OrchardFactoryConfig config) {
		this.data = PropertiesUtil.toString(orchardFactoryConfig.dimensionOne() + "-" + orchardFactoryConfig.dimensionTwo() ,
				"No config found");

		logger.info("Read the dummy property value " + data);
		this.orchardFactoryConfig = config;
	}

	@Override
	public String getDimensionOne() {
		// TODO Auto-generated method stub
		return orchardFactoryConfig.dimensionOne();
	}

	@Override
	public String getDimensionTwo() {
		// TODO Auto-generated method stub
		return orchardFactoryConfig.dimensionTwo();
	}

}
