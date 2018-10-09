package me.taeil.redis.account;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash
@Getter@Setter
@Builder
@ToString
public class Account {
	@Id
	private String Id;

	private String username;

	private String email;
}
