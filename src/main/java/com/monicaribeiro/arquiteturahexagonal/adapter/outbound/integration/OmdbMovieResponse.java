package com.monicaribeiro.arquiteturahexagonal.adapter.outbound.integration;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.monicaribeiro.arquiteturahexagonal.domain.domain.Movie;

public class OmdbMovieResponse {
    @JsonProperty("imdbID")
    private String imdbID;

    @JsonProperty("Title")
    private String title;

    @JsonProperty("Poster")
    private String poster;

    public Movie toDomain() {
        return new Movie(imdbID, title, poster);
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
