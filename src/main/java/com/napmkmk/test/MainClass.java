package com.napmkmk.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appilcationCTX.xml");
		MyInfo myinfo1 = ctx.getBean("myInfo1", MyInfo.class);
		
		myinfo1.getInfoOutput();
		
		MyInfo myinfo2 = ctx.getBean("myInfo2", MyInfo.class);
		
		myinfo2.getInfoOutput();
		
		ctx.close();
		
	}
}