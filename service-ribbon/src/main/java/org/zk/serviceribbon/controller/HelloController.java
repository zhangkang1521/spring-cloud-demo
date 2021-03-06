package org.zk.serviceribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.zk.serviceribbon.service.HelloService;

@RestController
public class HelloController {

	@Autowired
	HelloService helloService;

	@GetMapping(value = "/hi")
	public String hi() {
		return helloService.hiService();
	}

}
