package com.monicaribeiro.arquiteturahexagonal.adapter.inbound.controller.request;

import com.monicaribeiro.arquiteturahexagonal.domain.domain.Movie;
import com.monicaribeiro.arquiteturahexagonal.domain.domain.User;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CreateUserRequest {
    @NotNull(message = "Name is mandatory.")
    private String name;

    @NotBlank(message = "Favorite movie name is mandatory.")
    private String favoriteMovieTitle;

    public User toUserDomain() {
        return new User(name, new Movie(favoriteMovieTitle));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteMovieTitle() {
        return favoriteMovieTitle;
    }

    public void setFavoriteMovieTitle(String favoriteMovieTitle) {
        this.favoriteMovieTitle = favoriteMovieTitle;
    }
}
