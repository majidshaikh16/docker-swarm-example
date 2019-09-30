package com.main.micro1;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "micro2")
@RibbonClient(name = "micro2")
public interface RestClient {
	@GetMapping("/greet-m2")
	public String callMicro2();

}
