package whitelist.me.datajpa.post;

import org.springframework.context.ApplicationEvent;

public class PostPublishedEvent extends ApplicationEvent {

    private final Post2 post;
    public PostPublishedEvent(Object source) {
        super(source);
        this.post = (Post2) source;
    }

    public Post2 getPost() {
        return post;
    }
}
