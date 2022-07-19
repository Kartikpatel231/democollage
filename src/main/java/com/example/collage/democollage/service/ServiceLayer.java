package com.example.collage.democollage.service;


import com.example.collage.democollage.entity.CollageEntity;
import com.example.collage.democollage.entity.StudentEntity;
import com.example.collage.democollage.repository.CollageRepo;
import com.example.collage.democollage.repository.StudentRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceLayer {
    //private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private CollageRepo collageRepo;

    @Autowired
    private StudentRepo studentRepo;


    public StudentEntity getStudent(StudentEntity studentEntity) {
        List<StudentEntity> studentEntities = new ArrayList<>();
        studentEntities.add(studentEntity);
        studentRepo.findAll().forEach(studentEntities::add);
    return studentEntity;
    }

    public StudentEntity createStudent(StudentEntity studentEntity) {
        studentRepo.save(studentEntity);
        return studentEntity;
    }

    public CollageEntity getCollage(CollageEntity collageEntity) {
        List<CollageEntity> collageEntity1 = new ArrayList<>();
        collageEntity1.add(collageEntity);
        collageRepo.findAll().forEach(collageEntity1::add);
    return collageEntity;
    }

    public CollageEntity createCollage(CollageEntity collageEntity) {
        //  logger.info("Entering method");
        collageRepo.save(collageEntity);
        return collageEntity;
    }

    public void getAll(Long collage_id, Long student_id) {
     CollageEntity collageEntity=collageRepo.findById(collage_id).get();
     StudentEntity  studentEntity=studentRepo.findById(student_id).get();
     List<StudentEntity> studentEntities=new ArrayList<>();
     studentEntities.add(studentEntity);
     collageEntity.setStudentEntities(studentEntities);
    }
}