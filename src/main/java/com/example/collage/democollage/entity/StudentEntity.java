package com.example.collage.democollage.entity;

import javax.persistence.*;
import java.util.List;


    @Entity
    @Table
    public class StudentEntity {
        @Id
        @Column(name = "Student_Id")
        private Long id;
        private String name;
        private String email;
        private String gender;

        @ManyToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "Collage_id", referencedColumnName = "id")
        private CollageEntity collageEntity;

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

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public CollageEntity getCollageEntity() {
            return collageEntity;
        }

        public void setCollageEntity(CollageEntity collageEntity) {
            this.collageEntity = collageEntity;
        }

    }
