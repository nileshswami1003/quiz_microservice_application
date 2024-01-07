package com.question.services;

import com.question.entities.Question;
import org.springframework.stereotype.Service;

import java.util.List;

public interface QuestionService{

    Question create(Question question);

    List<Question> get();

    Question get(Long id);

    List<Question> getAllQuestionsOfQuiz(Long quizId);
}
