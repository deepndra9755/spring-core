package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.spring.controller.ControllerIMPL;

@Configuration
@Import(value ={ControllerIMPL.class})
//@ComponentScan("com.spring")
public class ParentConfig {

}
