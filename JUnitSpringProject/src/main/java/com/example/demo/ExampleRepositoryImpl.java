package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository
public class ExampleRepositoryImpl {
	
	
    public String get() {
        return "Hello JUnit and junes of sopra steria";	
    }

	public String getById(int id) {
		// TODO Auto-generated method stub
		String n = String.valueOf(id);
		return n;
	
	}

}
