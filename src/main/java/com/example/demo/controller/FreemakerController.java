package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.bean.Resource;

@Controller
@RequestMapping("/ftl")
public class FreemakerController {
	@Autowired
	private Resource resource;

	@RequestMapping("/index")
	public String index(ModelMap map) {
		map.addAttribute("resource", resource);
		return "freemaker/index";
	}

	@RequestMapping("/center")
	public String center() {
		return "freemaker/center/center";
	}

}
