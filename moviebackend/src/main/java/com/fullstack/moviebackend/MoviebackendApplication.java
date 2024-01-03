package com.fullstack.moviebackend;

import com.fullstack.moviebackend.model.Review;
import com.fullstack.moviebackend.repository.ReviewRepository;
import com.fullstack.moviebackend.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviebackendApplication {
	public static void main(String[] args) {SpringApplication.run(MoviebackendApplication.class, args);}

}
