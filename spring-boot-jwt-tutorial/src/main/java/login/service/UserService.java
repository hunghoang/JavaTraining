package login.service;

import login.model.User;

public interface UserService {
	User findByEmail(String email);

	User findByEmailAndPassword(String email, String password);

}
