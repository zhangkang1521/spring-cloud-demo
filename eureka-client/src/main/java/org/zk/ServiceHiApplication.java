package org.zk;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * EurekaClient实现服务提供
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceHiApplication {

	@Value("${server.port}")
	String port;

	public static void main(String[] args) {
		SpringApplication.run( ServiceHiApplication.class, args );
	}

	@RequestMapping("/hi")
	public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
		return "hi " + name + " ,i am from port:" + port;
	}

}
