package com.blz.greeting.service;

import com.blz.greeting.model.Greeting;
import com.blz.greeting.model.User;

public interface IGreetingService {
	Greeting addGreeting(User user);
	Greeting getGreetingById(long Id);
}
