package com.portfolio.Projects.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {
    @Bean
   public ModelMapper mapper(){
        return new ModelMapper();
    }
}
