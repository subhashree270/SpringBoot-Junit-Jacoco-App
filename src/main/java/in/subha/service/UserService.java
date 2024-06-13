package in.subha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.subha.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	private UserDao dao;
	
	public String getName(Integer id) {
		System.out.println(dao.getClass().getName());
		String name = dao.findNameById(id);
		System.out.println("Name :: "+name);
		return name;
	}
	

}
