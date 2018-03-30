package Dao;

import java.util.List;

import Entity.User;

public interface UserDao {
	
	Integer addUser(User user);
	
	List<User> userList();
	
	Integer deleteUser(Integer id);
}
