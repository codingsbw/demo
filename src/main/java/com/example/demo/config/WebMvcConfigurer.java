package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.example.demo.interceptor.OneInterceptor;
import com.example.demo.interceptor.TwoInterceptor;


@SuppressWarnings("deprecation")
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		/**
		 * 拦截器按照顺序执行
		 */
		
//		registry.addInterceptor(new OneInterceptor()).addPathPatterns("/one/**");
//		registry.addInterceptor(new OneInterceptor()).addPathPatterns("/*/**");
//		registry.addInterceptor(new TwoInterceptor()).addPathPatterns("/two/**")
//		 .addPathPatterns("/one/**");
		registry.addInterceptor(new TwoInterceptor()).addPathPatterns("/two/**");
		
		super.addInterceptors(registry);
	}

}
