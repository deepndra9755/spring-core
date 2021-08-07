package com.std.configg;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DateGen {
@Bean("gul")
public Date gest()
{
return new Date();
}
}
