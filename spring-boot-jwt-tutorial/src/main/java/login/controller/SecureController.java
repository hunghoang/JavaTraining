package login.controller;

import io.jsonwebtoken.Claims;
import login.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import login.service.UserService;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/secure")
public class SecureController {

	@Autowired
	private UserService userService;

	@RequestMapping("/me")
	public ResponseEntity<User> loginSuccess(HttpServletRequest request) {
		Claims claims = (Claims) request.getAttribute("claims");
		User user = new User();
		user.setEmail((String) claims.get("email"));
		user.setFirstName((String) claims.get("firstName"));
		user.setLastName((String) claims.get("lastName"));
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

}
