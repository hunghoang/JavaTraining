package login.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import login.dao.UserDao;
import login.model.User;
import login.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public User findByEmail(String email) {
		return userDao.findByEmail(email);
	}

	public User findByEmailAndPassword(String email, String password) {
		// Lookup user has given email and password using userDao.

		// These below for TEST:
		if ("javaclass@gmail.com".equals(email) && "1234".equals(password)) {
			User user = new User();
			user.setEmail(email);
			user.setFirstName("Java");
			user.setLastName("class");
			return user;
		}
		return null;
	}
}
