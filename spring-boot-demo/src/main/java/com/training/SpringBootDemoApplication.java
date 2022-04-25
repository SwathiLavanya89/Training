package com.training;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.training.model.Book;
import com.training.repo.BookRepo;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@Autowired
	private BookRepo bookRepo;
	
	@PostConstruct
	public void saveBooks()
	{
		bookRepo.save(new Book(1234l, "Alchemist", 225.50, 100l));
		bookRepo.save(new Book(4467l, "Think like a Monk", 325.50, 100l));
		bookRepo.save(new Book(6789l, "One Minute Manager", 255.50, 100l));
		
	}
	
}