package com.example.collage.democollage.entity;

import javax.persistence.*;
import java.util.List;


    @Entity
    @Table(name = "Student")
    public class StudentEntity {
   //    @OneToOne(mappedBy = "collageId")
     //  CollageEntity collageEntity;
        @Id
        @Column(name = "Student_Id")
        private Long id;
        private String name;
        private String email;
        private String gender;

        //@OneToMany(cascade = CascadeType.ALL)
        //@JoinColumn(name = "Collage_id_fk")
        //private CollageEntity collageList;

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

       // public List<CollageEntity> getCollageList() {
         //   return collageList;
        //}

        //public void setCollageList(List<CollageEntity> collageList) {
          //  this.collageList = collageList;
        //}//

    }
