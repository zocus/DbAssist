package com.montrosesoftware.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.montrosesoftware.entities, com.montrosesoftware.repositories")           //TODO may be wrong
@PropertySource("classpath:/config/application.properties")
public class TestConfig {}
