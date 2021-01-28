package com.spring.conferenceWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@SpringBootApplication
//public class ConferenceWebAppApplication extends SpringBootServletInitializer {
//
//	public static void main(String[] args) {
//		SpringApplication.run(ConferenceWebAppApplication.class, args);
//	}
//
//}

@SpringBootApplication
public class ConferenceWebAppApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ConferenceWebAppApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(ConferenceWebAppApplication.class, args);
	}

//	@RequestMapping(value = "/")
//	public String hello() {
//		return "Hello World from Tomcat";
//	}
}
