package com.example.collage.democollage.repository;

import com.example.collage.democollage.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<StudentEntity ,Long> {
}
