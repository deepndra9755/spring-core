package com.spring.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.spring.dao.DaoImpl;
import com.spring.service.ServiceImpl;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
//@Import(value {ServiceImpl.class,DaoImpl.class,})
@Import(value = {ServiceImpl.class,DaoImpl.class})
@ComponentScan("com.spring")
public class ChildConfig {
@Bean
public HikariDataSource getDP()
{
	
	 HikariConfig config = new HikariConfig();
      HikariDataSource ds;
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl( "jdbc:mysql://localhost:3306/emp" );
        config.setUsername( "root" );
        config.setPassword( "root" );
        return ds = new HikariDataSource( config );
    }


}
