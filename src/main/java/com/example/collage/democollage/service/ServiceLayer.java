package com.example.collage.democollage.service;


import com.example.collage.democollage.entity.CollageEntity;
import com.example.collage.democollage.entity.StudentEntity;
import com.example.collage.democollage.repository.CollageRepo;
import com.example.collage.democollage.repository.StudentRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceLayer {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private CollageRepo collageRepo;

    @Autowired
    private StudentRepo studentRepo;

    public void getCollage(CollageEntity collageEntity){
        logger.info("Entering method");
       collageRepo.save(collageEntity);
    }

    public List<StudentEntity> getStudents(StudentEntity studentEntity){
        logger.info("Student entity");
        List<StudentEntity> studentEntities=new ArrayList<>();
       studentRepo.findAll().forEach(studentEntities::add);
        return studentEntities;
    }
   /* public void getUpdate(CollageEntity collageEntity){
        collageRepo.save(collageEntity);
    }
    public void getDeleted(CollageEntity collageEntity){
        collageRepo.delete(collageEntity);
    }?8*/
}
