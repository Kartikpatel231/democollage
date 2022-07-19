package com.example.collage.democollage.controller;

import com.example.collage.democollage.entity.CollageEntity;
import com.example.collage.democollage.entity.StudentEntity;
import com.example.collage.democollage.service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/collage")
public class CollageController {
@Autowired
    private ServiceLayer serviceLayer;
    @GetMapping("/welcom")
    public String Hello(){
        return  "Welcome to kartik patel page";
    }

    @GetMapping("/get")
    public CollageEntity getCollage(@RequestBody CollageEntity collageEntity) {
       return serviceLayer.getCollage(collageEntity);
    }
    @PostMapping("/post")
    public CollageEntity createCollage(@PathVariable CollageEntity collageEntity){
        return serviceLayer.createCollage(collageEntity);

    }
}


