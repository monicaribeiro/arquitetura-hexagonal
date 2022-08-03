package com.monicaribeiro.arquiteturahexagonal.adapter.outbound.repository;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "favoriteMovieId")
    private String favoriteMovieId;

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

    public String getFavoriteMovieId() {
        return favoriteMovieId;
    }

    public void setFavoriteMovieId(String favoriteMovieId) {
        this.favoriteMovieId = favoriteMovieId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", favoriteMovieId='" + favoriteMovieId + '\'' +
                '}';
    }
}
