package org.zk.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SayHiController {

	@RequestMapping("/hi")
	@HystrixCommand(fallbackMethod = "hiError")
	public String home() {
		return "hi-service";
	}

	public String hiError() {
		return "hi,sorry,error!";
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
