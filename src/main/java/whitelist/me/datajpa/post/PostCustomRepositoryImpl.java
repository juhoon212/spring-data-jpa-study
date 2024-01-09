package whitelist.me.datajpa.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@Transactional
public class PostCustomRepositoryImpl implements PostCustomRepository<Post2>{

    @Autowired
    EntityManager entityManager;


    @Override
    public List<Post2> findMyPost() {
        return entityManager.createQuery("SELECT p from Post2 AS p", Post2.class)
                .getResultList();
    }

    @Override
    public void delete(Post2 entity) {
        entityManager.remove(entity);
    }
}
