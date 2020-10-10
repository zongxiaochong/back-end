package com.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfigurer implements WebMvcConfigurer {

	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		String[] patterns = {"/**"};
		String[] excludePathPatterns = {"/", "/login", "/getValidCode", "/doLogin", "/static/**"};
		registry.addInterceptor(new LoginInterceptor())
			.addPathPatterns(patterns).excludePathPatterns(excludePathPatterns);
	}
	
}
