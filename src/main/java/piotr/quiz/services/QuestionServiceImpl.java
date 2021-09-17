package piotr.quiz.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import piotr.quiz.entities.Question;
import piotr.quiz.repositories.QuestionRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository questionRepository;

    @Override
    public Question getQuestion(Long quizId, Long questionId) {
        return null;
    }

    @Override
    public Question getQuestion(Long questionId) {
        return null;
    }

    @Override
    public List<Question> getQuestions(Long quizId) {
        return this.questionRepository.findByQuizId()
    }
}
