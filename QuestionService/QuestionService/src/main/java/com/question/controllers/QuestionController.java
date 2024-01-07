package com.question.controllers;

import com.question.entities.Question;
import com.question.services.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    //get request to get all questions
    @GetMapping
    public List<Question> get(){
        return questionService.get();
    }

    //get request to get single question
    @GetMapping("/{id}")
    public Question get(@PathVariable Long id){
        return questionService.get(id);
    }

    //post request to save question
    @PostMapping
    public Question create(@RequestBody Question question){
        return questionService.create(question);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getAllQuestionsOfQuiz(@PathVariable Long quizId){
        return questionService.getAllQuestionsOfQuiz(quizId);
    }
}
