package com.fast;

import com.fast.properties.MyProperties;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.core.env.Environment;


@ConfigurationPropertiesScan
@SpringBootApplication
public class SpringBootPracticeApplication {


	private String name;
	private Environment environment;
	private MyProperties myProperties;

	 public SpringBootPracticeApplication(
			 @Value("${my.name}") String name,
			 Environment environment,
			 MyProperties myProperties
	 ) {
		 this.name = name;
		 this.environment = environment;
		 this.myProperties = myProperties;
	 }

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPracticeApplication.class, args);
	}

	@PostConstruct
	public void init() {
		 System.out.println(name);
		 System.out.println(environment.getProperty("my.name"));
		 System.out.println(myProperties.getName());
	}
}
