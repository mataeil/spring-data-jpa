package me.taeil.mongo;

import lombok.RequiredArgsConstructor;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

import me.taeil.mongo.account.Account;
import me.taeil.mongo.account.AccountRepository;

@SpringBootApplication
@RequiredArgsConstructor
public class MongoApplication {

	private final MongoTemplate mongoTemplate;
	private final AccountRepository accountRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongoApplication.class, args);
	}

	@Bean
	public ApplicationRunner applicationRunner() {
		return args -> {
//			mongoTemplate.insert(Account.builder().username("taeil").email("taeil0915@gmail.com").build());
			accountRepository.insert(Account.builder().username("dwayne").email("dwayne.ma@kakaokcorp.com").build());
		};
	}
}
