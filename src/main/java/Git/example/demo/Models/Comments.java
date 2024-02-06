package Git.example.demo.Models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "comments")
public class Comments {

    private String author = "Frasse";

    private String text;

    public Comments() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
