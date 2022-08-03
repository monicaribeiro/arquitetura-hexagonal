package com.monicaribeiro.arquiteturahexagonal.domain.domain;

import com.monicaribeiro.arquiteturahexagonal.adapter.outbound.repository.UserEntity;

import java.util.Optional;

public class User {
    private Long id;
    private String name;
    private Movie favoriteMovie;

    public User() {
    }

    public User(String name, Movie favoriteMovie) {
        this.name = name;
        this.favoriteMovie = favoriteMovie;
    }

    public User(Long id, String name, Movie favoriteMovie) {
        this.id = id;
        this.name = name;
        this.favoriteMovie = favoriteMovie;
    }

    public static User fromEntity(UserEntity userEntity) {
        Movie movie = new Movie();
        movie.setImdbID(userEntity.getFavoriteMovieId());
        return new User(userEntity.getId(), userEntity.getName(), movie);
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

    public Movie getFavoriteMovie() {
        return favoriteMovie;
    }

    public void setFavoriteMovie(Movie favoriteMovie) {
        this.favoriteMovie = favoriteMovie;
    }
}
