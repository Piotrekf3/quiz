package piotr.quiz.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import piotr.quiz.dto.SaveQuizDto;
import piotr.quiz.entities.Quiz;
import piotr.quiz.services.QuizService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/quizes")
@RequiredArgsConstructor
public class QuizController {

    private final QuizService quizService;

    @GetMapping("{id}")
    public Quiz getQuiz(@PathVariable Long id) {
        return this.quizService.getQuiz(id);
    }

    @GetMapping()
    public List<Quiz> getQuizes() {
        return this.quizService.getQuizes();
    }

    @PostMapping()
    public void addQuiz(@RequestBody SaveQuizDto saveQuizDto) {
        this.quizService.saveQuiz(saveQuizDto.toQuiz());
    }
}
