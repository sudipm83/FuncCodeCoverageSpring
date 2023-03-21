package com.funccodecovrg.FuncCodeCoverage.unit.service;

import com.funccodecovrg.FuncCodeCoverage.service.TestService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServiceTest {
    @Test
    public void testGreetingService() {

        TestService testService = new TestService();
        Assertions.assertEquals("hello sam", testService.greeting("sam"));
    }
}
