package com.monicaribeiro.arquiteturahexagonal.adapter.inbound.controller.request;

import com.monicaribeiro.arquiteturahexagonal.domain.domain.Movie;
import com.monicaribeiro.arquiteturahexagonal.domain.domain.User;

import javax.validation.constraints.NotBlank;

public class CreateUserRequest {
    @NotBlank(message = "Nome é obrigatório")
    private String name;

    @NotBlank(message = "Nome do filme/série favorito é obrigatório")
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
