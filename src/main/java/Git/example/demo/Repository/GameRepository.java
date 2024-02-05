package Git.example.demo.Repository;

import Git.example.demo.Models.Game;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GameRepository extends MongoRepository<Game, String> {
}
