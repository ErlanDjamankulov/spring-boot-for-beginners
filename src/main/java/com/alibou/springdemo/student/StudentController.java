package com.alibou.springdemo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")


public class StudentController {

    @GetMapping
    public List<String> findAllStudents(){
        return List.of(
                "Alibou",
                "hello world"
        );
    }
}
