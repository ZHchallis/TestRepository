package Mapper;

import java.util.List;

import Entity.User;

public interface UserMapping {
	
	Integer addUser(User user);
	
	List<User> userList();
	
	Integer deleteUser(Integer id);
}
