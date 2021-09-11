package piotr.quiz.services;

import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.apache.commons.collections4.IteratorUtils;
import org.springframework.stereotype.Service;
import piotr.quiz.entities.Quiz;
import piotr.quiz.repositories.QuizRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {

    private final QuizRepository quizRepository;

    @Override
    public Quiz getQuiz(Long id) {
        return this.quizRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public List<Quiz> getQuizes() {
        return IterableUtils.toList(this.quizRepository.findAll());
    }

    @Override
    public void saveQuiz(Quiz quiz) {
        this.quizRepository.save(quiz);
    }
}
