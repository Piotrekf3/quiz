package piotr.quiz.dto;

import org.junit.jupiter.api.Test;
import piotr.quiz.entities.Question;
import piotr.quiz.entities.Quiz;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SaveQuizDtoTest {

    @Test
    void toQuiz() {
        SaveQuestionDto saveQuestionDto = new SaveQuestionDto();
        saveQuestionDto.setText("text");
        saveQuestionDto.setTitle("title");
        List<SaveQuestionDto> saveQuestionDtos = new ArrayList<>();
        saveQuestionDtos.add(saveQuestionDto);

        SaveQuizDto saveQuizDto = new SaveQuizDto();
        saveQuizDto.setName("name");
        saveQuizDto.setQuestions(saveQuestionDtos);

        assertEquals("name", saveQuizDto.toQuiz().getName());
        assertEquals("text", saveQuizDto.toQuiz().getQuestions().get(0).getText());
    }
}