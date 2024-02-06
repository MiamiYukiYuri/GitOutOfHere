package Git.example.demo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Orders")
public class Order {

    @Id
    public String id;

    public String gameId;

    public String userId;


}
