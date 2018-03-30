package Controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Dao.UserDao;
import Entity.User;

@Controller
public class UserController {

	@Resource
	UserDao userDao;

	
	@RequestMapping("/add")
	private String toAdd() {
		return "addUser";
	}
	
	@RequestMapping("/list")
	private String toList(Model model) {
		List<User> users = userDao.userList();
		System.out.println(users.toString());
		model.addAttribute("users", users);
		return "showUser";
	}
	
	@RequestMapping("/addUser")
	private String addUser(String name,Integer age) {
		User use =new  User();
		use.setName(name);
		use.setAge(age);
		userDao.addUser(use);
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	private String deleteUser(Integer id) {
		userDao.deleteUser(id);
		return "redirect:list";
	}
}
