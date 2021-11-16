package com.food.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.food.model.User_Table;
import com.food.repository.UserTableRepository;

@Service
@Transactional
public class UserTableService {
	@Autowired
	UserTableRepository userTableRepository;

	public User_Table saveMyUser(User_Table user_Table) {
		User_Table userDetails = new User_Table();
		try {
			user_Table.setRole("user");

			userDetails = userTableRepository.save(user_Table);
		} catch (Exception exception) {
			System.out.println("Exception caught in saveMyUser Method :" + exception);
		}
		return userDetails;
	}

	public List<User_Table> FetchMyUser() {
		List<User_Table> userList = new ArrayList<User_Table>();
		try {
			userList = (List<User_Table>) userTableRepository.findAll();
		} catch (Exception exception) {
			System.out.println("Exception caught in FetchMyUser Method :" + exception);
		}
		return userList;
	}

	public User_Table FetchUserName(int id) {
		User_Table userDetails = new User_Table();
		try {
			userDetails = userTableRepository.findById(id).get();
		} catch (Exception exception) {
			System.out.println("Exception caught in FetchUserName Method :" + exception);
		}
		return userDetails;
	}
}

