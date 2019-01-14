package com.Iselect.home.bdd.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    public User() {
    }

    public User(String firstName, String fonction, int age) {
        this.firstName = firstName;
        this.fonction = fonction;
        this.age = age;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    private String firstName;

    private String fonction;

    private int age;

    @Override
    public String toString() { 
        return "User [id=" + id + ", firstName=" + firstName + 
                ", fonction=" + fonction + ", age=" + age + "]";
    }                    

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
  

}
