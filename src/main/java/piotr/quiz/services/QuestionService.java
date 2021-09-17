package piotr.quiz.services;

import piotr.quiz.entities.Question;

import java.util.List;

public interface QuestionService {

    Question getQuestion(Long quizId, Long questionId);
    Question getQuestion(Long questionId);
    List<Question> getQuestions(Long quizId);
}
