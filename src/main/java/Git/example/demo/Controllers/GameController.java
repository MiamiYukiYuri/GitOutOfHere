package Git.example.demo.Controllers;

import Git.example.demo.Models.Game;
import Git.example.demo.Services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class GameController {

    //Create a game.
    @Autowired
    GameService gameService;

    @PostMapping("/games")
    public Game createGame(@RequestBody Game game){
        return gameService.createGame(game);
    }

}