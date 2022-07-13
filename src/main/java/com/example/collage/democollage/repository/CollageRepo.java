package com.example.collage.democollage.repository;

import com.example.collage.democollage.entity.CollageEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollageRepo extends CrudRepository<CollageEntity,Long> {
}
