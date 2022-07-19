package com.example.collage.democollage.controller;

import com.example.collage.democollage.entity.CollageEntity;
import com.example.collage.democollage.entity.StudentEntity;
import com.example.collage.democollage.service.ServiceLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/collage")
public class ControllerLayer {
    @Autowired
    private ServiceLayer serviceLayer;

    @PostMapping("/{collage_id}/student/{student_id}")
    public void getAll(@PathVariable Long collage_id,@PathVariable Long student_id ){
        serviceLayer.getAll(collage_id,student_id);
        }

    }
    //  private final Logger logger=LoggerFactory.getLogger(this.getClass());


