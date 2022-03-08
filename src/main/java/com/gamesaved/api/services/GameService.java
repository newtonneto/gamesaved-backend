package com.gamesaved.api.services;

import com.gamesaved.api.dto.RawgDTO;
import com.gamesaved.api.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional
    public void populate() {
        String uri = "https://api.rawg.io/api/games?key=e30c4b13ba264b8680f0fcab95f1b69a";
        RestTemplate template = new RestTemplate();
        RawgDTO data;

        for (int index = 0; index < 10; index++) {
            data = template.getForObject(uri, RawgDTO.class);
            uri = data.getNext();
            gameRepository.saveAll(Arrays.asList(data.getResults()));
        }
    }
}
