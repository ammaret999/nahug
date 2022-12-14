package com.appman.nahug.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "test_user")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long id_user;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "email_user",unique = true)
    private String email_user;
    @Column(name = "password")
    private String password;

//    @OneToMany(targetEntity = CatModel.class,cascade = CascadeType.ALL)
//    @JoinColumn(name = "cu_fk",referencedColumnName = "id_user")
//    @Column(name = "cat_list")
//    private List<CatModel> catList;

    public UserModel(){}

    public UserModel(Long id_user, String first_name, String last_name, String email_user, String password) {
        this.id_user = id_user;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email_user = email_user;
        this.password = password;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail_user() {
        return email_user;
    }

    public void setEmail_user(String email_user) {
        this.email_user = email_user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
