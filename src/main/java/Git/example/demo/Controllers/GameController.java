package Git.example.demo.Controllers;

import Git.example.demo.Models.Comment;
import Git.example.demo.Models.Game;
import Git.example.demo.Services.GameService;
import Git.example.demo.exception.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    // Get filtrera på taggar
    @GetMapping("/search")
    public List<Game> findGameByTags(@RequestParam List<String> tags) {
        return gameService.findGameByTags(tags);
    }

    @PutMapping
    public Game updateGame(@RequestBody Game game) {
        return gameService.updateGame(game);
    }
    //POST add comment to game
    @PostMapping("/{gameId}/comments")
    public ResponseEntity<Game> addCommentToGame(@PathVariable String gameId, @RequestBody Comment comment) {
       try {
           Game updateGame = gameService.addCommentToGame(gameId, comment);
           return ResponseEntity.ok(updateGame);
       } catch (EntityNotFoundException e) {
           return ResponseEntity.notFound().build();
       }
    }
}