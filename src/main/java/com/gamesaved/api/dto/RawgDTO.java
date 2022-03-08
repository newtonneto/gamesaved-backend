package com.gamesaved.api.dto;

import com.gamesaved.api.domain.Game;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class RawgDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer count;
    private String next;
    private String previous;
    private Game[] results;

    public RawgDTO() {

    }

    public RawgDTO(Integer count, String next, String previous, Game[] results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }
}
