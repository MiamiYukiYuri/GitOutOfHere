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

    @CreatedDate
    public Date created_at;

    public List<Comment> comments = new ArrayList<>();

    public Game() {
    }
    public void addComment (Comment comment) {
        this.comments.add(comment);
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
}