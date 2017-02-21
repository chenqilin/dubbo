package com.alibaba.dubbo.demo.provider;

import com.alibaba.dubbo.demo.DemoService;

public class DemoServiceImpl implements DemoService{

	@Override
	public String sayHello(String name) {
		 int i = 1 /0;
		 return "Hello " + name;
	}

}
