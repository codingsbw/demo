package com.example.demo.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class IMOOCExceptionHandler {
	public static final String IMOOC_ERROR_VIEW="thymeleaf/error";
	@ExceptionHandler(value=Exception.class)
	public Object errorHandler(HttpServletRequest reqest, HttpServletResponse response, Exception e) throws Exception {

		e.printStackTrace();

		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", e);
		mav.addObject("url", reqest.getRequestURL());
		mav.setViewName(IMOOC_ERROR_VIEW);
		return mav;
	}
}
