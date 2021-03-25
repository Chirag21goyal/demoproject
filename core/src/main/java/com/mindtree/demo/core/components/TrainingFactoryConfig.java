package com.mindtree.demo.core.components;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.metatype.annotations.Option;

@ObjectClassDefinition(name = "Training Factory Service Configuration", description = "Training Factory Service Configuration")
public @interface TrainingFactoryConfig {

	@AttributeDefinition(name="File Path", description= "file path ", type = AttributeType.STRING)
	String filePath() default "C:/";
	
	
	@AttributeDefinition(
		    name = "Author Gender",
		    description = "Describe Author Gender",
		    options= {
                @Option(label = "Male", value = "1. Male"),
		        @Option(label = "Female", value = "2. Female")
		    },
		    defaultValue = "Female",
		    type= AttributeType.STRING)
	String gender() default "female";
	
	@AttributeDefinition(name = "CheckBox Property " ,type = AttributeType.BOOLEAN ,description = "please Check the Property")
	boolean checkbox();
	

}
