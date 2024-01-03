package com.fullstack.moviebackend.controller;

import com.fullstack.moviebackend.model.Review;
import com.fullstack.moviebackend.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/api/v1/reviews")
@CrossOrigin("http://localhost:3000")
public class ReviewController {
    @Autowired
    public ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String,String> payload){
        return new ResponseEntity<Review>(
                reviewService.createReview(payload.get("reviewBody"),payload.get("imdbId")),
                HttpStatus.CREATED
        );
    }

}
