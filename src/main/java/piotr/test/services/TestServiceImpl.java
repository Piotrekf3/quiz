package piotr.test.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import piotr.test.entities.Test;
import piotr.test.repositories.TestRepository;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;

    @Override
    public Test getTest(Long id) {
        return this.testRepository.getOne(id);
    }
}
