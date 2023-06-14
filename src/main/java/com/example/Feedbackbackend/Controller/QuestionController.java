package com.example.Feedbackbackend.Controller;


import com.example.Feedbackbackend.Entity.Question;
import com.example.Feedbackbackend.Service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/question")
@RequiredArgsConstructor
@CrossOrigin
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping
    public List<Question> getAllQuestion(){
        return questionService.getAll();
    }

    @PostMapping
    public Question saveQuestions(@RequestBody Question question){
        return questionService.createNewQuestion(question);
    }

//    @PostMapping
//    public
}
