package com.stackroute.domain;

public class Movie {
    private Actor actor;
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void displayActor()
    {
        System.out.println("Name of the Actor :"+actor.getName()+"\n"+"Gender :"+actor.getGender()+"\n"+"Age :"+actor.getAge());
    }


}
