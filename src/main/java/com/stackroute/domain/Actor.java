package com.stackroute.domain;
//pojo class of actor
public class Actor {
    private String name;
    private String gender;
    private int age;

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println("Name :" + name + " Gender :" + gender + " Age :" + age);
    }


}
