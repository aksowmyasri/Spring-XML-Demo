package com.stackroute.domain;

import java.rmi.MarshalledObject;

public class Movie {

    private Actor actor;

    public Movie(){}
    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void displayActor()
    {
        actor.display();
    }


}
