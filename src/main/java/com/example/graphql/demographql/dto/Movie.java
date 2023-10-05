package com.example.graphql.demographql.dto;

import java.util.List;

public record Movie(long id, String title, int year, List<String> genres, String director) {}
