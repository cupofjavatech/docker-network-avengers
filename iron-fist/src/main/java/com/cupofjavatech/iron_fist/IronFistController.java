package com.cupofjavatech.iron_fist;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/iron-fist")
public class IronFistController {

	private RestTemplate restTemplate;
	
	@Value("${url.red.hood}")
	private String urlRedHood;
	
	public IronFistController() {
		restTemplate = new RestTemplate();
	}
	
	@GetMapping
	public String getString() {
		return "iron-fist";
	}
	
	@GetMapping("calling-buddy")
	public String callingRedHood() {
		String responseStr = restTemplate.getForObject(urlRedHood, String.class);
		return responseStr;
	}
}
