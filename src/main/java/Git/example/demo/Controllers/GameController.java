package Git.example.demo.Controllers;

import Git.example.demo.Models.Game;
import Git.example.demo.Services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/games")
public class GameController {

    //Create a game.
    @Autowired
    GameService gameService;

    @PostMapping
    public Game createGame(@RequestBody Game game){
        return gameService.createGame(game);
    }
    @GetMapping("/all")
    public List<Game> getAllGames() {
        return gameService.getAllGames();
    }
    @PutMapping
    public Game updateGame(@RequestBody Game game) {
        return gameService.updateGame(game);
    }
}