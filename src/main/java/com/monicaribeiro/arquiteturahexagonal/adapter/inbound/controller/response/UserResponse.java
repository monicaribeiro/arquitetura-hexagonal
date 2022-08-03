package com.monicaribeiro.arquiteturahexagonal.adapter.inbound.controller.response;

import com.monicaribeiro.arquiteturahexagonal.domain.domain.User;

public class UserResponse {

    private Long id;
    private String name;
    private MovieResponse favoriteMovie;

    public UserResponse() {
    }

    public UserResponse(Long id, String name, MovieResponse favoriteMovie) {
        this.id = id;
        this.name = name;
        this.favoriteMovie = favoriteMovie;
    }

    public static UserResponse fromDomain(User user) {
        return new UserResponse(user.getId(), user.getName(), MovieResponse.fromDomain(user.getFavoriteMovie()));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MovieResponse getFavoriteMovie() {
        return favoriteMovie;
    }

    public void setFavoriteMovie(MovieResponse favoriteMovie) {
        this.favoriteMovie = favoriteMovie;
    }
}
