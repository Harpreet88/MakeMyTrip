package com.cg.mmt.services;

import com.cg.mmt.beans.Login;
import com.cg.mmt.beans.User;

public interface UserService {

	  void register(User user);

	  User validateUser(Login login);
	}
