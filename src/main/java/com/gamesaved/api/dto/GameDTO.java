package com.gamesaved.api.dto;

import java.io.Serializable;

public class GameDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private String released;
    private String background_image;
    private double rating;
    private Integer metacritic;

    public GameDTO() {

    }

    public GameDTO(Integer id, String name, String released, String background_image, double rating, Integer metacritic) {
        this.id = id;
        this.name = name;
        this.released = released;
        this.background_image = background_image;
        this.rating = rating;
        this.metacritic = metacritic;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public String getBackground_image() {
        return background_image;
    }

    public void setBackground_image(String background_image) {
        this.background_image = background_image;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Integer getMetacritic() {
        return metacritic;
    }

    public void setMetacritic(Integer metacritic) {
        this.metacritic = metacritic;
    }
}
