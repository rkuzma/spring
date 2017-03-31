package org.rkuzma.service;

import org.rkuzma.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}