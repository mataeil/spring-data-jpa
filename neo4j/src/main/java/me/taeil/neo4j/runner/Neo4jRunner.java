package me.taeil.neo4j.runner;

import java.util.Arrays;
import java.util.HashSet;

import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import me.taeil.neo4j.domain.Account;
import me.taeil.neo4j.domain.Role;
import me.taeil.neo4j.repo.AccountRepository;

@Component
public class Neo4jRunner implements ApplicationRunner {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	AccountRepository accountRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Session session = sessionFactory.openSession();
		/*session.save(Account.builder()
		                    .username("taiel")
		                    .email("taeil.ma0915@gmail.com")
		                    .set(
		                    		new HashSet<Role>(
		                    				Arrays.asList(Role.builder()
						                                      .role("developement").build()))
		                    ).build());*/
		accountRepository.save(Account.builder()
		                              .username("taiel1")
		                              .email("taeil1.ma0915@gmail.com")
		                              .set(
				                              new HashSet<Role>(
						                              Arrays.asList(Role.builder()
						                                                .role("developement").build()))
		                              ).build());
		sessionFactory.close();

	}
}
