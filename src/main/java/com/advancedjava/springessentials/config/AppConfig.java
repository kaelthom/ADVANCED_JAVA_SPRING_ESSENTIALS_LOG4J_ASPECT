package com.advancedjava.springessentials.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.advancedjava.springessentials")
@EnableAspectJAutoProxy
public class AppConfig {
}