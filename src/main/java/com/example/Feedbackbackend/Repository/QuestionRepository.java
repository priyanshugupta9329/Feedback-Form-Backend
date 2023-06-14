package com.example.Feedbackbackend.Repository;


import com.example.Feedbackbackend.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

    public List<Question> findAll();

//    Question save(Question question);

//    List<Question> saveRating(List<Question> question);


}
