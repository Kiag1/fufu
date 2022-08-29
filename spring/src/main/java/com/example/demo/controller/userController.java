package com.example.demo.controller;

import com.example.demo.common.Result;
import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
@CrossOrigin
@RestController
@RequestMapping("/user")
public class userController {
    @Resource
    StudentMapper studentMapper;

    @PostMapping
    public Result<?> add(@RequestBody Student student) {
        System.out.println(student);
        studentMapper.insert(student);
        return Result.success();
    }

}
