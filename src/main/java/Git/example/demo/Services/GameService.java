package Git.example.demo.Services;

import Git.example.demo.Models.Comment;
import Git.example.demo.Models.Game;
import Git.example.demo.Repository.GameRepository;
import Git.example.demo.exception.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    //Create a game.
    public Game createGame(Game game){
        return gameRepository.save(game);
    }
    // GET ALL Games
    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }
    // UPDATE a game
    public Game updateGame(Game game) {
        return gameRepository.save(game);
    }
     public Game addCommentToGame(String gameId, Comment comment) {
         return gameRepository.findById(gameId)
                .map(game -> {
                    game.addComment(comment);
                    return gameRepository.save(game);
                })
                .orElseThrow(() -> new EntityNotFoundException("Recipe with id: " + gameId + " was not found!"));
    }


}
