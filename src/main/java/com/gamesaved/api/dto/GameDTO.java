package com.gamesaved.api.dto;

import com.gamesaved.api.domain.enums.Platforms;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class GameDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private String released;
    private String background_image;
    private double rating;
    private Integer metacritic;
    private PlatformDTO[] platforms;

    public GameDTO() {

    }

    public GameDTO(
            Integer id, String name, String released, String background_image, double rating, Integer metacritic,
            PlatformDTO[] platforms
    ) {
        this.id = id;
        this.name = name;
        this.released = released;
        this.background_image = background_image;
        this.rating = rating;
        this.metacritic = metacritic;
        this.platforms = platforms;
    }
}
