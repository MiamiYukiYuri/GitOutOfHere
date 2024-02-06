package Git.example.demo.Repository;

import Git.example.demo.Models.Game;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface GameRepository extends MongoRepository<Game, String> {

    List<Game> findByTagsIn(List<String> tags);
}
