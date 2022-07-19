package com.example.collage.democollage.controller;

import com.example.collage.democollage.entity.StudentEntity;
import com.example.collage.democollage.service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Student")
public class StudentController {
    @Autowired
    private ServiceLayer serviceLayer;

    @GetMapping("/welcom")
    public String Hello(){
        return  "Welcome to kartik patel page";
    }

    @GetMapping("/get")
    public StudentEntity getStudent(@RequestBody StudentEntity studentEntity) {
      return   serviceLayer.getStudent(studentEntity);

    }
    @PostMapping("/post")
    public StudentEntity createStudent(@PathVariable StudentEntity studentEntity){
        return serviceLayer.createStudent(studentEntity);

    }
}

