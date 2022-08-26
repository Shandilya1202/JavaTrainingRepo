package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ExampleRepositoryImplTest {
		
		@Mock	
		private ExampleRepositoryImpl exampleRepo;
		
		@InjectMocks// auto inject helloRepository
		private ExampleServiceImpl helloService = new ExampleServiceImpl();
		
		@BeforeEach
		void setMockOutput()
		{
			when(exampleRepo.get()).thenReturn("Hello Mockito From Repository");
		}
		
		@DisplayName("Test Mock helloService + helloRepository")
		@Test
		void testGet()
		{
			assertEquals("Hello Mockito From Repository",helloService.get());
		}

	}


