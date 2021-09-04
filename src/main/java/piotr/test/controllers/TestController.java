package piotr.test.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import piotr.test.entities.Test;
import piotr.test.services.TestService;

@RestController
@RequestMapping("/tests")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/{id}")
    public Test getTest(@PathVariable Long id) {
        return this.testService.getTest(id);
    }
}
