package piotr.quiz.dto;

import lombok.Getter;
import lombok.Setter;
import piotr.quiz.entities.Question;

import javax.validation.constraints.NotNull;

@Setter
@Getter
public class SaveQuestionDto {
    private String text;
    @NotNull
    private String title;

    public Question toQuestion() {
        return Question.builder()
                .text(text)
                .title(title)
                .build();
    }
}
