package me.taeil.neo4j.domain;

import java.util.HashSet;
import java.util.Set;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
@Getter@Setter
@Builder
public class Account {
	@Id
	@GeneratedValue
	private Long id;

	private String username;

	private String email;

	@Relationship(type = "has")
	private Set<Role> set = new HashSet<>();
}
