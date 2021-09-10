package piotr.quiz.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import piotr.quiz.entities.Quiz;
import piotr.quiz.repositories.QuizRepository;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {

    private final QuizRepository quizRepository;

    @Override
    public Quiz getQuiz(Long id) {
        return this.quizRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
}
