package com.mrscottmcallister.search.resource;

/**
 * Created by smcallister on 2017-01-29.
 */
public class Game {
    int id;
    String score_phrase;
    String title;
    String url;
    String platform;
    double score;
    String genre;
    boolean editors_choice;
    int release_year;
    int release_month;
    int release_day;

    public Game(){ }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getScore_phrase() {
        return score_phrase;
    }

    public void setScore_phrase(String score_phrase) {
        this.score_phrase = score_phrase;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isEditors_choice() {
        return editors_choice;
    }

    public void setEditors_choice(boolean editors_choice) {
        this.editors_choice = editors_choice;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public int getRelease_month() {
        return release_month;
    }

    public void setRelease_month(int release_month) {
        this.release_month = release_month;
    }

    public int getRelease_day() {
        return release_day;
    }

    public void setRelease_day(int release_day) {
        this.release_day = release_day;
    }
}
