package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ExampleServiceTest {
	
	@Autowired
	ExampleServiceImpl exampleService;
	
	@DisplayName("Test Spring @Autowired Integration")
	@Test
	void testGet()
	{
		assertEquals("Hello JUnit 5",exampleService.get());
	}
	
	@Test
	void testGetById()
	{
		int id =10;
		String result = exampleService.getById(id);
		assertEquals("The id is dummy value",result);
	}
	
	@Test
	//exception scenario
	void testGetById_Exception()
	{
		assertThrows(RuntimeException.class,()->exampleService.getById(420));
	}

}
