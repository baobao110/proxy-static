package com.proxy.proxy;

import com.proxy.service.service;

public class proxy {
	
	private service server=new service();
	
	public void login() {
		System.out.println("代理开始");
		server.login();
		System.out.println("代理后");
	}
	//这里就是代理类,代理类其实就是在类中创建工作类对象,实现具体功能,代理模型就是应用于Spring中的注入

}
