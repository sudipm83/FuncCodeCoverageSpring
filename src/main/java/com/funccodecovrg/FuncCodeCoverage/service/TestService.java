package com.funccodecovrg.FuncCodeCoverage.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



@Service
@Component
public class TestService {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestService.class);



    public TestService() {

    }


    public String greeting(String name) {
        return "hello " + name;
    }
}
