package com.niit.backendc3s4mc;

import com.niit.backendc3s4mc.filter.JwTockenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackendC3S4McApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendC3S4McApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean filterTocken(){
		FilterRegistrationBean frb = new FilterRegistrationBean();
		frb.setFilter(new JwTockenFilter());
		frb.addUrlPatterns("/api/v1/*");
		return frb;
	}

}
