package com.quiz.controllers;

import com.quiz.entities.Quiz;
import com.quiz.services.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping
    //get request to get all quiz
    public List<Quiz> get(){
        return quizService.get();
    }

    @GetMapping("/{id}")
    //get request to get single quiz
    public Quiz get(@PathVariable Long id){
        return quizService.get(id);
    }

    @PostMapping
    public Quiz create(@RequestBody Quiz quiz){
        return quizService.add(quiz);
    }
}
