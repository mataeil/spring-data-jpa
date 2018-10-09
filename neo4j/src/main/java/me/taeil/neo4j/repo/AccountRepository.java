package me.taeil.neo4j.repo;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import me.taeil.neo4j.domain.Account;

public interface AccountRepository extends Neo4jRepository<Account, Long> {}
