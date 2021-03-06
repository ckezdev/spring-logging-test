package de.syracom.ckalig.elasticsearchtest.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/")
    public void test() {
        logger.info("GET");
    }

    @GetMapping("/{id}")
    public void testWithId(@PathVariable Long id) {
        logger.info("GET with ID: " + id);
    }

}
