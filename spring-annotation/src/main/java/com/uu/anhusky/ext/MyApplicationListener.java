package com.uu.anhusky.ext;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationListener implements ApplicationListener<MyEvent> {

	//当容器中发布此事件以后，方法触发
	@Override
	public void onApplicationEvent(MyEvent event) {
		// TODO Auto-generated method stub
		System.out.println("收到事件："+event);
	}

}
