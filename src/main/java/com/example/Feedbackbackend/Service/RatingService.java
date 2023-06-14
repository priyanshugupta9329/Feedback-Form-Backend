package com.example.Feedbackbackend.Service;

import com.example.Feedbackbackend.Entity.Rating;
import com.example.Feedbackbackend.Repository.RatingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RatingService {

    private final RatingRepository ratingRepository;

    public void createNewRating(Rating question) {

      ratingRepository.save(question);
//      return ;
    }

}
