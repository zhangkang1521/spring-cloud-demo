package org.zk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SayHiController {

	@RequestMapping("/hi")
	public String home() {
		return "hi-service";
	}

	@RequestMapping("/call-user")
	public String info(){
		return restTemplate.getForObject("http://localhost:8763/user",String.class);
	}

	@Autowired
	private RestTemplate restTemplate;

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

}
