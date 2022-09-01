package com.theking.pc.entity;

/**
 * @author TheKing
 * @version 1.0
 * @className TestEntity
 * @description
 * @date 2022/8/23 10:18
 */
public class TestEntity {
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "id = "+id+" name = "+name;
    }
}
