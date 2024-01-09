package whitelist.me.datajpa.post;

import org.springframework.context.ApplicationListener;

public class PostListener implements ApplicationListener<PostPublishedEvent> {
    @Override
    public void onApplicationEvent(PostPublishedEvent event) {
        System.out.println("===================================");
        System.out.println(event.getPost() + " is published");
    }
}
