package com.example.Feedbackbackend.Service;

import com.example.Feedbackbackend.Entity.Question;
import com.example.Feedbackbackend.Repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<Question> getAll(){
        return questionRepository.findAll();
    }

//    public Question CreateNewQuestion(Question question){
//        return questionRepository.save(question);
//    }

    public Question createNewQuestion(Question task) {
        return questionRepository.save(task);
    }

//    public List<Question>


}
