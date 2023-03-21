package com.funccodecovrg.FuncCodeCoverage.unit.controller;

import com.funccodecovrg.FuncCodeCoverage.controller.TestController;
import com.funccodecovrg.FuncCodeCoverage.service.TestService;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


@RunWith(SpringRunner.class)
@WebMvcTest(TestController.class)
public class ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TestService testService;


}
