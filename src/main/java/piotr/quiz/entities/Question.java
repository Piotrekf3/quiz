package piotr.quiz.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotNull
    @Column(nullable = false)
    private String title;

    @Column
    private String text;

    @ManyToOne()
    @JoinColumn(name = "quiz_id", referencedColumnName = "id")
    private Quiz quiz;

}
