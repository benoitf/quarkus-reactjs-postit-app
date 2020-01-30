package org.eclipse.chedemos;

import java.util.Date;
import javax.persistence.*;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Post extends PanacheEntity {
    private String title;
    private String content;
    private long timestamp;

    public Post() {
    }

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
        this.timestamp = new Date().getTime();
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

}
