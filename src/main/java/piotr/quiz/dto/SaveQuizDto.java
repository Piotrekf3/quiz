package piotr.quiz.dto;

import lombok.Getter;
import lombok.Setter;
import piotr.quiz.entities.Question;
import piotr.quiz.entities.Quiz;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class SaveQuizDto {

    @NotNull
    private String name;
    private List<SaveQuestionDto> questions;

    public Quiz toQuiz() {
        List<Question> questions = this.questions.stream()
                .map(SaveQuestionDto::toQuestion)
                .collect(Collectors.toList());

        return Quiz.builder()
                .name(name)
                .questions(questions)
                .build();
    }
}
