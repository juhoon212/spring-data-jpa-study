package whitelist.me.datajpa;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Comment {

    @Id
    @GeneratedValue
    private Long id;

    private String comment;

}
