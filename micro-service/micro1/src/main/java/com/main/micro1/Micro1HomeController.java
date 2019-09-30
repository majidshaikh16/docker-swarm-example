package com.main.micro1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Micro1HomeController {

	@Autowired
	private RestClient restClient;
	
	@Value("${MY_SECRET:no password set}")
	private String mySecret;
	
	
	@GetMapping(path="/greet-m1")
	public String greet() {
		callMicro2();
		System.out.println("This is my secret : "+ mySecret);
		return "Greeting from micro-1";
	}
	
	private void callMicro2() {
//		String url = "http://micro2:9002/greet-m2";
//		RestTemplate restTemplate = new RestTemplate();
//		ResponseEntity<String> forEntity = restTemplate.getForEntity(url, String.class);
//		System.out.println("response from micro-2 : "+forEntity.getBody());
		
		System.out.println("response from micro-2 : "+restClient.callMicro2());
	}
}
