package com.example.collage.democollage.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class CollageEntity {
    @Id
    private Long id;
    private String name;
    private String address;
    private String email;
    @OneToMany(cascade = CascadeType.ALL)
    private List<StudentEntity> studentEntities;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<StudentEntity> getStudentEntities() {
        return studentEntities;
    }

    public void setStudentEntities(List<StudentEntity> studentEntities) {
        this.studentEntities = studentEntities;
    }


    //public void setStudentEntities(List<StudentEntity> studentEntities) {
      //this.studentEntities = studentEntities;foreign key (collage_id_fk) references collage_entity_table
    //Hibernate: alter table student add constraint FKlwo0ioronsn5ianvu1k4w0h9f foreign key (student_id)   references collage_entity_table
    //}//
}
