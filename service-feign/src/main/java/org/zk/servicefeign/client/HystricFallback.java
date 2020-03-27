package org.zk.servicefeign.client;

import org.springframework.stereotype.Component;

@Component
public class HystricFallback implements SayHiClient{

	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry "+name;
	}
}
