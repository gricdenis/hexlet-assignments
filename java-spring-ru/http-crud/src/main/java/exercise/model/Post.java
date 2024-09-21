package exercise.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Post {
    private String id;
    private String title;
    private String body;

//    public Post(String id, String title, String body) {
//    }

    public Object getId() {
        return this.id;
    }

    public Object getTitle() {
        return this.title;
    }

    public Object getBody() {
        return this.body;
    }

    public void setId(Object id) {
        this.id = id.toString();
    }

    public void setTitle(Object title) {
        this.title = title.toString();
    }

    public void setBody(Object body) {
        this.body = body.toString();
    }
}
