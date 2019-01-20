package com.xzc.mlshop;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MlshopApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder MlshopApplication) {
		return MlshopApplication.sources(MlshopApplication.class);
	}

    public static void main(String[] args) {
        new SpringApplicationBuilder(MlshopApplication.class).run(args);
    }

}

