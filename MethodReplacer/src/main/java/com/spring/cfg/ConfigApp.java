package com.spring.cfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages ="com.spring")
@ImportResource("com/spring/cfg/applicationContext.xml")
public class ConfigApp {
	
}
