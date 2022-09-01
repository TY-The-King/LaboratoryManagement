package com.theking.pc.service.impl;

import com.theking.pc.entity.TestEntity;
import com.theking.pc.mapper.TestMapper;
import com.theking.pc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author TheKing
 * @version 1.0
 * @className TestServiceImpl
 * @description
 * @date 2022/8/23 10:19
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestMapper testMapper;

    public List<TestEntity> getTest(){
        return testMapper.getTest();
    }
}
