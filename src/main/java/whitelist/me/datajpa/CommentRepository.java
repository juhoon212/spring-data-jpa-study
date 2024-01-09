package whitelist.me.datajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Long> {

//    @Query(value = "Select c from Comment c", nativeQuery = true)
//    List<Comment> findByTitleContains(String keyword);


    Comment save(Comment comment);

    // 단일 값
    Optional<Comment> findById(Long id);

    List<Comment> findAll();
}
