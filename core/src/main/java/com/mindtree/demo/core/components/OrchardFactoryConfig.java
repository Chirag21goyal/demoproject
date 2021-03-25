package com.mindtree.demo.core.components;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Orchard Factory Service Configuration", description = "Orchard Factory Service Configuration")
public @interface OrchardFactoryConfig {

	@AttributeDefinition(name = "Dimension 1", description = "Image D1", type = AttributeType.STRING)
	String dimensionOne() default "230";

	@AttributeDefinition(name = "Dimension 2", description = "Image D2", type = AttributeType.STRING)
	String dimensionTwo() default "540";

}
