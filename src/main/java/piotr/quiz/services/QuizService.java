package piotr.quiz.services;

import piotr.quiz.entities.Quiz;

import java.util.List;

public interface QuizService {

    Quiz getQuiz(Long id);
    List<Quiz> getQuizes();
    void saveQuiz(Quiz quiz);

}
