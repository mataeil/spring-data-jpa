package me.taeil.redis.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import me.taeil.redis.account.Account;
import me.taeil.redis.account.AccountRepository;

@Component
public class RedisRunner implements ApplicationRunner {
	@Autowired
	StringRedisTemplate redisTemplate;
	@Autowired
	AccountRepository accountRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();
		opsForValue.set("taeil", "dwayne");
		opsForValue.set("springboot", "2.0");
		opsForValue.set("hello", "world");

		Account account = Account.builder()
								    .username("taeil")
									.email("taeil.ma0915@gmail.com")
									.build();
		accountRepository.save(account);
		Optional<Account> byId = accountRepository.findById(account.getId());
		if (byId.isPresent()) {
			System.out.println(byId.get().toString());
		}
	}
}
