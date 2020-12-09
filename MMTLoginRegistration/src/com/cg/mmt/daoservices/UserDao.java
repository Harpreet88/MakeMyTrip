package com.cg.mmt.daoservices;

import com.cg.mmt.beans.Login;
import com.cg.mmt.beans.User;

public interface UserDao {
	
	void register(User user);

	  User validateUser(Login login);
}
