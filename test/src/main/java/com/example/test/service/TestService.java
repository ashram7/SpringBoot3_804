package com.example.test.service;

import com.example.test.entity.Test;

import java.util.Optional;

public interface TestService {
    Iterable<Test> selectAll();
    Optional<Test> selectOneById(Integer id);
    Optional<Test> selectOneRandomTest();
    Boolean checkTest(Integer id, Boolean myAnswer);
    void insertTest(Test test);
    void updateTest(Test test);
    void deleteTestById(Integer id);
}
