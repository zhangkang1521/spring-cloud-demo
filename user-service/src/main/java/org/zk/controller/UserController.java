package org.zk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping("/user")
	public String user() {
		return "Hi,I am user-service";
	}
}
