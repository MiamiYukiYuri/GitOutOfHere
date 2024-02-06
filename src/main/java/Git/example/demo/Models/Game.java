package Git.example.demo.Models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Document (collection = "Games")
public class Game {

    @Id
    public String id;

    public String title;

    public int price;

    public List<String> tags = new ArrayList<>();

    @CreatedDate
    public Date created_at;

    public Game() {
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}