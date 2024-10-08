package com.example.testProject;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@ComponentScan
@EnableJpaRepositories("com.example.testProject.repository")
@Configuration
@EnableWebMvc
public class TestAppConfiguration implements WebMvcConfigurer {

}