package com.ljheee.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

//		HelloMessage message = new HelloMessage("DI");
		
		//加载配置文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		//从上下文获得对象
		HelloMessage b1 = (HelloMessage) context.getBean("hm");
		b1.setMessage("b1");
		System.out.println(b1.getMessage());
		
		
		HelloMessage b2 = (HelloMessage) context.getBean("hm");
		b2.setMessage("b2");
		
		System.out.println(b2.getMessage());
		
		context.close();
	}

}
