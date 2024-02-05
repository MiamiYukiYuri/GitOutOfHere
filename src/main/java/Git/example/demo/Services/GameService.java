package Git.example.demo.Services;

import Git.example.demo.Models.Game;
import Git.example.demo.Repository.GameRepository;
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


}
