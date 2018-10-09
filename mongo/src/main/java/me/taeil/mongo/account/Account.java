package me.taeil.mongo.account;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "accounts")
@Getter@Setter
@Builder
public class Account {
	@Id
	private String Id;

	private String username;

	private String email;
}
