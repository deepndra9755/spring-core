package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.spring.DAO.DataAccessTEAM;
import com.spring.DAO.Registering;
import com.spring.Service.CalculatorAppIMPL;
import com.spring.controler.Controll;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@Import(value ={Registering.class,CalculatorAppIMPL.class,Controll.class})
public class Configuree {
    @Bean
	public HikariDataSource gettt()
{
 HikariConfig config = new HikariConfig();
     HikariDataSource ds;

  
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl("jdbc:mysql://@localhost:3306/emp");
        config.setUsername( "root" );
        config.setPassword( "root" );
        
       return ds = new HikariDataSource( config );
  
}
}
