package com.example.graphql.demographql.controller;

import com.example.graphql.demographql.dto.Actor;
import com.example.graphql.demographql.repository.ActorRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ActorController {

    private final ActorRepository actorRepository;

    public ActorController(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    /*
    Mapping the method to a query by setting the name attribute of the @QueryMapping annotation
    */
    @QueryMapping(name = "actorById")
    public Actor findActorById(@Argument Long id) {
        return actorRepository.getById(id);
    }
}
