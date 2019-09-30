package com.main.naming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@EnableEurekaServer
//@RestController
public class NamingApplication {

	public static void main(String[] args) {
		SpringApplication.run(NamingApplication.class, args);
	}
	
	@GetMapping(path="/greet")
	public @ResponseBody String greet(){
		System.out.println("Changed the imagedddddd......");
		return "imageee has changedddd!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
	}

}
