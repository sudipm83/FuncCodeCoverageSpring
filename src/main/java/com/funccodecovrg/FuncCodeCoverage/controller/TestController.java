package com.funccodecovrg.FuncCodeCoverage.controller;

import com.funccodecovrg.FuncCodeCoverage.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);
    @Autowired
    private TestService testService;


    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping(path = "/hello",
            produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String hello() {
        return "hello";
    }
    @GetMapping(path = "/hello/greeting/{name}",
            produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String greeting(@PathVariable(value = "name") String name) {
        return testService.greeting(name);
    }
}
