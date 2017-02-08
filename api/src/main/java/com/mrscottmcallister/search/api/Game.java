package com.mrscottmcallister.search.api;

import io.searchbox.client.JestResult;

/**
 * Created by smcallister on 2017-01-29.
 */
public class Game {
    private String scorePhrase;
    private String title;
    private String url;
    private String platform;
    private double score;
    private String genre;
    private boolean editorsChoice;
    private int releaseYear;
    private int releaseMonth;
    private int releaseDay;

    public String getScorePhrase() {
        return scorePhrase;
    }

    public void setScorePhrase(String scorePhrase) {
        this.scorePhrase = scorePhrase;
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

    public boolean isEditorsChoice() {
        return editorsChoice;
    }

    public void setEditorsChoice(boolean editorsChoice) {
        this.editorsChoice = editorsChoice;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    public int getReleaseDay() {
        return releaseDay;
    }

    public void setReleaseDay(int releaseDay) {
        this.releaseDay = releaseDay;
    }
}
