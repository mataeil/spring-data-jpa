package me.taeil.mongo.account;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataMongoTest
public class AccountRepositoryTest {
	@Autowired
	private AccountRepository accountRepository;

	@Test
	public void findByEmail() {
		accountRepository.insert(Account.builder().username("taeil2").email("taeil2@kakaocorp.com").build());



		Optional<Account> byEmail = accountRepository.findByEmail("taeil2@kakaocorp.com");
		assertThat(byEmail).isNotEmpty();
		assertThat(byEmail.get().getUsername()).isEqualTo("taeil2");
	}
}