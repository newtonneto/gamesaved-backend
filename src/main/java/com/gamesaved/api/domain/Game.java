package com.gamesaved.api.domain;

import com.gamesaved.api.domain.enums.Platforms;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Game implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private String uuid;

    private String name;
    private Date released;
    private String background_image;
    private double rating;
    private Integer metacritic;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "PLATFORMS")
    private Set<Integer> platforms = new HashSet<>();

    public Game() {

    }

    public Game(String uuid, String name, Date released, String background_image, double rating, Integer metacritic) {
        this.uuid = uuid;
        this.name = name;
        this.released = released;
        this.background_image = background_image;
        this.rating = rating;
        this.metacritic = metacritic;
    }

    public void addPlatform(Platforms platform) {
        platforms.add(platform.getCod());
    }
}
