package piotr.quiz.dto;

import org.junit.jupiter.api.Test;
import piotr.quiz.entities.Question;

import static org.junit.jupiter.api.Assertions.*;

class SaveQuestionDtoTest {

    @Test
    void toQuestion() {
        SaveQuestionDto saveQuestionDto = new SaveQuestionDto();
        saveQuestionDto.setTitle("title");
        saveQuestionDto.setText("text");

        Question expectedQuestion = Question.builder()
                .title("title")
                .text("text")
                .build();

        Question resultQuestion = saveQuestionDto.toQuestion();
        assertEquals(resultQuestion.getTitle(), expectedQuestion.getTitle());
        assertEquals(resultQuestion.getText(), expectedQuestion.getText());

    }
}