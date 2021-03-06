	package com.blz.greeting.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blz.greeting.model.Greeting;
import com.blz.greeting.model.User;
import com.blz.greeting.service.IGreetingService;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
	private static final String template = "Hello, %s!";
//	private final AtomicLong counter= new AtomicLong();
	
	@Autowired
	public IGreetingService greetingService;
	
	@GetMapping(value= {" ", "/", "/home"})
	public Greeting greeting(@RequestParam(value= "name", defaultValue = "World")String name) {
		User user = new User();
		user.setFirstName(name);
		return greetingService.addGreeting(user);
	}
	
}
