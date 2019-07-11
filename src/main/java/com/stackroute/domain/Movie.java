package com.stackroute.domain;

import java.util.List;

public class Movie {
    private List<Actor> actor;

    public Movie(List<Actor> actor) {
        this.actor = actor;
    }

    public void displayActor()
    {
        for(Actor actor: actor) {
            actor.display();
        }
    }


}
