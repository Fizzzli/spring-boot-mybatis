package com.fizz.tutorial.controller;

import com.fizz.tutorial.dal.mapper.TestMapper;
import com.fizz.tutorial.dal.model.TestDO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author LIZHE
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private TestMapper testMapper;

    @GetMapping("/{id}")
    public TestDO get(@PathVariable Long id) {
        return testMapper.selectById(id);
    }

    @PutMapping("/")
    public Long create(@RequestBody TestDO testDO) {
        testMapper.insert(testDO);
        return testDO.getId();
    }


}
