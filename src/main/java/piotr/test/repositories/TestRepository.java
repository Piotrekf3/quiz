package piotr.test.repositories;

import piotr.test.entities.Test;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface TestRepository extends CrudRepository<Test, Long> {

    Test getOne(Long id);
}
