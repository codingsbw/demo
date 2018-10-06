package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.utils.IMoocJSONResult;

@Controller
@RequestMapping("/err")
public class ErrorController {
	@RequestMapping("/error")
	public String error() {
		int a = 1 / 0;
		return "thymeleaf/error";// 这里已经不重要了
	}

	@RequestMapping("/ajaxerror")
	public String ajaxerror() {
		return "thymeleaf/ajaxerror";
	}

	@RequestMapping("/getAjaxerror")
	@ResponseBody
	public IMoocJSONResult getAjaxerror() {
		int a = 1 / 0;
		return IMoocJSONResult.ok();
	}
}
