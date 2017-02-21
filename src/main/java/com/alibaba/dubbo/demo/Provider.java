package com.alibaba.dubbo.demo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
	public static void main(String[] args) throws IOException {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
	     context.start();
	     System.out.println("请按任意键退出");
	     System.in.read(); // 按任意键退出
	}
}
