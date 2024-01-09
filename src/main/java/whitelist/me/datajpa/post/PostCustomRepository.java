package whitelist.me.datajpa.post;

import java.util.List;

public interface PostCustomRepository<T> {

    List<Post2> findMyPost();

    void delete(T entity);
}
