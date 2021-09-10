package piotr.quiz.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import piotr.quiz.entities.Quiz;
import piotr.quiz.services.QuizService;

@RestController
@RequestMapping("/quizes")
@RequiredArgsConstructor
public class QuizController {

    private final QuizService quizService;

    @GetMapping("/{id}")
    public Quiz getQuiz(@PathVariable Long id) {
        return this.quizService.getQuiz(id);
    }
}
