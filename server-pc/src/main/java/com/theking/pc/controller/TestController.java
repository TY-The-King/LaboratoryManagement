package com.theking.pc.controller;

import com.theking.pc.entity.TestEntity;
import com.theking.pc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author TheKing
 * @version 1.0
 * @className TestController
 * @description
 * @date 2022/8/23 10:18
 */
@RestController
public class TestController {

    private final TestService testService;

    @Autowired
    public TestController (TestService testService){
        this.testService = testService;
    }

    @GetMapping("/get")
    public List<TestEntity> getTest(){
        return testService.getTest();
    }
}
