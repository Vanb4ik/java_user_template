package com.vebinar.entyty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "USER")

public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    public User() {

    }
   /* public User(int id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }*/
    public void setId(int id) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }
    @Id
    private int id;

    @Column(name = "EMAIL", length = 10)
    private String email;

    @Column(name = "AGE")
    private int age;

    @Column(name = "NAME", length = 10)
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
