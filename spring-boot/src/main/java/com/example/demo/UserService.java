package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class UserService {

	User findById(long id) {

		return null;
	}

	List<User> findAllUsers() {
		return new ArrayList<>();
	}

	boolean isUserExist(User user) {
		return true;
	}

	void saveUser(User user) {
	}

	void deleteUserById(long id) {
	}

	void updateUser(User currentUser) {
	}

	void deleteAllUsers() {
	}

}
