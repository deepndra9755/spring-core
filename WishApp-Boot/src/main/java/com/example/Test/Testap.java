package com.example.Test;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Testap {

@Bean("gup")
public Date getd()
{ 
return new Date();	
}
}
