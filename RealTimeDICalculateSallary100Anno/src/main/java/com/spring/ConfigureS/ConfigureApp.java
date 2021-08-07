package com.spring.ConfigureS;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan("com.spring")
public class ConfigureApp {
@Bean("dat")
public DataSource getpp()
{
	 HikariConfig config = new HikariConfig();
	     HikariDataSource ds;

	   
	        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
	        config.setJdbcUrl("jdbc:mysql://@localhost:3306/emp");
	        config.setUsername("root");
	        config.setPassword("root");
	        return ds = new HikariDataSource( config );
	        
	    	
}
}
