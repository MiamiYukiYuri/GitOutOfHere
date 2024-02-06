package Git.example.demo.Models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Document(collection = "customers")
public class Customer {
    @Id
    private String id;

    private String email;

    private String password;

    @CreatedDate
    private Date created_at;

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Date getCreated_at() {
        return created_at;
    }
}
