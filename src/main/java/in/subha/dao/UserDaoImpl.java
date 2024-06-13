package in.subha.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
	@Override
	public String findNameById(Integer id) {
		return "Maggie";
	}

}
