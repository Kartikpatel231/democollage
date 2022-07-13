package com.example.collage.democollage.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CollageEntityTable")
public class CollageEntity {
    @Id
    private Long id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Student_Id")
   private List<StudentEntity> studentEntities;
    private String address;
    private String email;

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


}
