package com.proxy.proxy;

import com.proxy.service.service;

public class proxy {
	
	private service server=new service();
	
	public void login() {
		System.out.println("����ʼ");
		server.login();
		System.out.println("�����");
	}
	//������Ǵ�����,��������ʵ���������д������������,ʵ�־��幦��,����ģ�;���Ӧ����Spring�е�ע��

}
