package com.gamesaved.api.domain;

import com.gamesaved.api.domain.enums.Platforms;
import com.gamesaved.api.dto.GameDTO;
import com.gamesaved.api.dto.PlatformDTO;
import jdk.swing.interop.SwingInterOpUtils;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    public Game(GameDTO item) {
        name = item.getName();
        addDate(item.getReleased());
        background_image = item.getBackground_image();
        rating = item.getRating();
        metacritic = item.getMetacritic();
        addPlatform(item.getPlatforms());
    }

    public void addPlatform(PlatformDTO[] gamePlatforms) {
        for (PlatformDTO platformDto : gamePlatforms) {
            platforms.add(platformDto.getPlatform().getId());
        }
    }

    public void addDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder builder = new StringBuilder();
        try {
            String[] splitedDate = date.split("-");
            builder.append(splitedDate[2]);
            builder.append("/");
            builder.append(splitedDate[1]);
            builder.append("/");
            builder.append(splitedDate[0]);
            Date parsedDate = sdf.parse(builder.toString());
            setReleased(parsedDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
