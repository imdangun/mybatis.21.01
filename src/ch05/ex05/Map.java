package ch05.ex05;

import java.util.List;

import ch05.domain.User;

public interface Map {
	List<User> selectUsers(String userName);
}
