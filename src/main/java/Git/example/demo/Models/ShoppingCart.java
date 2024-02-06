package Git.example.demo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "ShoppingCart")

public class ShoppingCart {
    @Id
    private String id;

    // array list of games?
    private List<String> gameId;

    private String customerId;

    private int price;

    private int totalSum;


    // Empty constructor
    public ShoppingCart() {
    }

    // Getters for id:s
    public String getId() {
        return id;
    }

   /* public String getGameId() {
        return gameId;
    } */

    public String getCustomerId() {
        return customerId;
    }

    // Getters and setters for price and totalSum
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(int totalSum) {
        this.totalSum = totalSum;
    }
}
