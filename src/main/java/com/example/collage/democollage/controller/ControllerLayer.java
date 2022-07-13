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
public class ControllerLayer {
@Autowired
    private ServiceLayer serviceLayer;

    private final Logger logger=LoggerFactory.getLogger(this.getClass());


@RequestMapping("/collage")
    public void getCollage(@RequestBody CollageEntity collageEntity){
    serviceLayer.getCollage(collageEntity);
}
@PostMapping("/collage/post")
   public List<StudentEntity> getStudents(@RequestBody StudentEntity studentEntity){
     return serviceLayer.getStudents(studentEntity);

}
 /*   @RequestMapping(method = RequestMethod.DELETE,value = "/collage/delete")
    public void getDeleted(@RequestBody CollageEntity collageEntity){
        serviceLayer.getDeleted(collageEntity);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/collage/update")
    public void getUpdate(@RequestBody CollageEntity collageEntity){
        serviceLayer.getUpdate(collageEntity);
    }
*/
}
