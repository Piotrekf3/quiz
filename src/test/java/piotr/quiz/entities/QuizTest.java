package piotr.quiz.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuizTest {

    @Test
    void testEquals() {
        Quiz quiz1 = Quiz.builder().id(1L).build();
        Quiz quiz2 = Quiz.builder().id(1L).build();

        Assertions.assertEquals(quiz1, quiz2);

        quiz2.setId(2L);

        Assertions.assertNotEquals(quiz1, quiz2);
    }
}