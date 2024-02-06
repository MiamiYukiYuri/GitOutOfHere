package Git.example.demo.Models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "Orders")
public class Order {

    @Id
    public String id;

    @DBRef
    private List<Game> gameOrders;

    @DBRef
    public String customerId;

    @CreatedDate
    public Date createdAt;

    public Order() {
    }

    //Getters.

    public String getId() {
        return id;
    }

    public List<Game> getGameOrders() {
        return gameOrders;
    }

    public String getCustomerIdId() {
        return customerId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
