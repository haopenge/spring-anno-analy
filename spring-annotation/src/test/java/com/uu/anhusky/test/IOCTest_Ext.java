package com.uu.anhusky.test;

import com.uu.anhusky.ext.ExtConfig;
import com.uu.anhusky.ext.MyEvent;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_Ext {
	
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext  =
				new AnnotationConfigApplicationContext(ExtConfig.class);
		
		
		//发布事件；
		applicationContext.publishEvent(new MyEvent(new String("我发布的事件")) {});
		
		applicationContext.close();
	}

}
