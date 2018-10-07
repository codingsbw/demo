package com.example.demo.mapper;

import java.util.List;

import com.example.demo.bean.SysUser;


public interface SysUserMapperCustom {
	
	List<SysUser> queryUserSimplyInfoById(String id);
}