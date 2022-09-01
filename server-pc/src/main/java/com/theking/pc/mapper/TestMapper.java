package com.theking.pc.mapper;

import com.theking.pc.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author TheKing
 * @version 1.0
 * @className TestMapper
 * @description
 * @date 2022/8/23 10:18
 */
@Mapper
public interface TestMapper {

    List<TestEntity> getTest();
}
