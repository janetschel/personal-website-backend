package de.janetschel.personal.website.backend.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "blog_entries")
public class BlogEntryEntity {
    @Id
    private String id;

    private String blogName;
    private LocalDateTime timestamp;
    private String writtenBy;
    private String content;

    public BlogEntryEntity(String blogName, LocalDateTime timestamp, String writtenBy, String content) {
        this.blogName = blogName;
        this.timestamp = timestamp;
        this.writtenBy = writtenBy;
        this.content = content;
    }
}
