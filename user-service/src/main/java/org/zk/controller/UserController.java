package org.zk.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableHystrix
@EnableHystrixDashboard
public class UserController {

	@RequestMapping("/user")
	@HystrixCommand(fallbackMethod = "hiError")
	public String user() {
		return "Hi,I am user-service";
	}

	public String hiError() {
		return "hi,sorry,error!";
	}
}
