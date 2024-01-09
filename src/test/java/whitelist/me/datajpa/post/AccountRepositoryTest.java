package whitelist.me.datajpa.post;

import com.querydsl.core.types.Predicate;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static whitelist.me.datajpa.post.QAccount.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AccountRepositoryTest {

    @Autowired
    AccountRepository accountRepository;

    @Test
    public void crud() {
        Predicate predicate = account
                .firstName.containsIgnoreCase("keesun")
                .and(account.lastName.startsWith("baik"));

        Optional<Account> one = accountRepository.findOne(predicate);
        Assertions.assertThat(one).isEmpty();


    }

}