package piotr.quiz.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import piotr.quiz.entities.Quiz;
import piotr.quiz.repositories.QuizRepository;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class QuizServiceImplTests {

    @Mock
    QuizRepository quizRepository;

    QuizService quizService;

    @BeforeEach
    void beforeEach() {
        quizService = new QuizServiceImpl(quizRepository);
    }

    @Test
    void getQuizShouldReturnTest() {
        Quiz expectedQuiz = Quiz.builder().id(2L).build();
        when(quizRepository.findById(any(Long.class)))
                .thenReturn(Optional.of(expectedQuiz));
        Quiz resultQuiz = quizService.getQuiz(1L);

        Assertions.assertEquals(expectedQuiz, resultQuiz);
    }

    @Test
    void getQuizShouldReturnException() {
        when(quizRepository.findById(any(Long.class)))
                .thenReturn(Optional.empty());

        Assertions.assertThrows(EntityNotFoundException.class, () -> quizService.getQuiz(1L));
    }
}