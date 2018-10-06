package com.example.demo.utils;

import javax.servlet.http.HttpServletRequest;

public class AjaxUtil {
	/**
	 * 
	 * @Title: IMoocExceptionHandler.java
	 * @Package com.imooc.exception
	 * @Description: 判断是否是ajax请求 Copyright: Copyright (c) 2017
	 *               Company:FURUIBOKE.SCIENCE.AND.TECHNOLOGY
	 * 
	 * @author leechenxiang
	 * @date 2017年12月3日 下午1:40:39
	 * @version V1.0
	 */
	public static boolean isAjax(HttpServletRequest httpRequest) {
		return (httpRequest.getHeader("X-Requested-With") != null
				&& "XMLHttpRequest".equals(httpRequest.getHeader("X-Requested-With").toString()));
	}
}
