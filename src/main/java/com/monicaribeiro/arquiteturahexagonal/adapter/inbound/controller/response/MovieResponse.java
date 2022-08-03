package com.monicaribeiro.arquiteturahexagonal.adapter.inbound.controller.response;

import com.monicaribeiro.arquiteturahexagonal.domain.domain.Movie;

public class MovieResponse {
    private String imdbID;
    private String title;
    private String poster;

    public MovieResponse() {
    }

    public MovieResponse(String imdbID, String title, String poster) {
        this.imdbID = imdbID;
        this.title = title;
        this.poster = poster;
    }

    public static MovieResponse fromDomain(Movie movie) {
        return new MovieResponse(movie.getImdbID(), movie.getTitle(), movie.getPoster());
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}
