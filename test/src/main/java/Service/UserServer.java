package Service;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import Dao.UserDao;
import Entity.User;
import Mapper.UserMapping;

@Service
public class UserServer implements UserDao{

	@Resource
	UserMapping userMapping;
	
	public Integer addUser(User user) {
		
		return userMapping.addUser(user);
	}

	public List<User> userList() {
		
		return userMapping.userList();
	}

	public Integer deleteUser(Integer id) {

		return userMapping.deleteUser(id);
	}
	
}
