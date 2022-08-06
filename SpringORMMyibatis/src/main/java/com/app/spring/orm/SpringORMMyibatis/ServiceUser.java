package com.app.spring.orm.SpringORMMyibatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceUser implements IMapper {

	public ServiceUser() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private IMapper imapper;
	
	@Override
	public List<User> selectAllUsers() {

		return imapper.selectAllUsers();
	}

	@Override
	public User selectClienteByID(int id_user) {

		return imapper.selectClienteByID(id_user);
	}

	@Override
	public int insertUser(User user) {

		return imapper.insertUser(user);
	}

}
