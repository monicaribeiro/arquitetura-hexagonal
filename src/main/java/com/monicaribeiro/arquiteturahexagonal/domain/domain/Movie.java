package com.monicaribeiro.arquiteturahexagonal.domain.domain;

public class Movie {
    private String imdbID;
    private String title;
    private String poster;

    public Movie() {
    }

    public Movie(String title) {
        this.title = title;
    }

    public Movie(String imdbID, String title, String poster) {
        this.imdbID = imdbID;
        this.title = title;
        this.poster = poster;
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
