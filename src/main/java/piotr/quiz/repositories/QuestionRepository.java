package piotr.quiz.repositories;

import org.springframework.data.repository.CrudRepository;
import piotr.quiz.entities.Question;

public interface QuestionRepository extends CrudRepository<Question, Long> {
}
