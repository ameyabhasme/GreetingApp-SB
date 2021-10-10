package com.blz.greeting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blz.greeting.model.Greeting;

public interface GreetingRepository extends JpaRepository<Greeting,Long>{

}
