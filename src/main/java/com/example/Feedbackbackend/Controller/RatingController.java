package com.example.Feedbackbackend.Controller;


import com.example.Feedbackbackend.Entity.Rating;
import com.example.Feedbackbackend.Service.RatingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@CrossOrigin
@RequestMapping("/rating")
@RequiredArgsConstructor
public class RatingController {

    private final RatingService ratingService;


    @PostMapping
    public String saveRating(@RequestBody Rating rating){

        ratingService.createNewRating(rating);

        return "Rating Added";
    }
}
