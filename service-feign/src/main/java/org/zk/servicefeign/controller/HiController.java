package org.zk.servicefeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.zk.servicefeign.client.SayHiClient;

@RestController
public class HiController {

	@Autowired
	SayHiClient sayHiClient;

	@GetMapping(value = "/hi")
	public String sayHi(@RequestParam String name) {
		return sayHiClient.sayHiFromClientOne( name );
	}

}
