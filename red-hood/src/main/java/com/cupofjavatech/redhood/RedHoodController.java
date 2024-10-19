package com.cupofjavatech.redhood;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/red-hood")
public class RedHoodController {

	@Value("${url.iron-fist}")
	private String urlIronFist;

	private RestTemplate restTemplate;

	public RedHoodController() {
		restTemplate = new RestTemplate();
	}

	@GetMapping
	public String getString() {
		return "red-hood";
	}

	@GetMapping("calling-buddy")
	public String callingIronFist() {
		String responseStr = restTemplate.getForObject(urlIronFist, String.class);
		return responseStr;
	}
}
