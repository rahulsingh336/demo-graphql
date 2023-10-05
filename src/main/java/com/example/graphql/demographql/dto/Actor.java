package com.example.graphql.demographql.dto;

import java.util.List;

public record Actor(Long id, String name, List<Movie> movies) {}
