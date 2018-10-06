package com.example.demo.controller;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.IMoocJSONResult;
import com.example.demo.bean.Resource;
import com.example.demo.bean.User;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private Resource resource;

	@RequestMapping("/getUser")
	public User getUser() {
		User user = new User();
		user.setName("imooc");
		user.setAge(18);
		user.setBirthday(new Date());
		user.setPassword("imooc");
		user.setDesc(null);
		return user;
	}

	@RequestMapping("/getUserJson")
	public IMoocJSONResult getUserJson() {
		User user = new User();
		user.setName("imooc");
		user.setAge(18);
		user.setBirthday(new Date());
		user.setPassword("imooc");
		user.setDesc(null);
		return IMoocJSONResult.ok(user);
	}

	@RequestMapping("/getResource")
	public IMoocJSONResult getResource() {
		Resource bean = new Resource();
		BeanUtils.copyProperties(resource, bean);
		return IMoocJSONResult.ok(bean);
	}
}
