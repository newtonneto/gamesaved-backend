package com.gamesaved.api.resources;

import com.gamesaved.api.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/games")
public class GameResource {
    @Autowired
    private GameService gameService;

    @RequestMapping(value = "/externalapi", method = RequestMethod.GET)
    public ResponseEntity<Void> externalApi() {
        gameService.populate();

        return ResponseEntity.noContent().build();
    }
}
