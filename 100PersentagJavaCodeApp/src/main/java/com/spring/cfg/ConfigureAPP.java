package com.spring.cfg;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com.spring")

public class ConfigureAPP {
@Bean("dd")
public Date getgg()
{
return new Date();
}
	

}
