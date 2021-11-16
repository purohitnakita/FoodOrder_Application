package com.food.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.food.model.Menu_Table;
import com.food.repository.MenuTableRepository;



@Service
public class AdminUpdateService {
	@Autowired
	MenuTableRepository menuTableRepository;
	@Transactional
	public Menu_Table saveMenuDetails(Menu_Table adminUpdate) {
		
			LocalDate date = LocalDate.now();
			System.out.println(date);
			String d = date.toString();
			adminUpdate.setDate_Of_Updation(d);
			return menuTableRepository.save(adminUpdate);
	}

	@Transactional
	public List<Menu_Table> menuList() {
		List<Menu_Table> menuList = new ArrayList<Menu_Table>();
			menuList = (List<Menu_Table>) menuTableRepository.findAll();
		return menuList;
	}

	@Transactional
	public void deletedish(Menu_Table menuList) {
		
			menuTableRepository.delete(menuList);
	}
	
	@Transactional
	public void deletedish1(String dish_Name) {
	
			menuTableRepository.deleteById(dish_Name);

	}

	
	@Transactional
	public void saveDish(Menu_Table dish_Name) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		String d = date.toString();
		dish_Name.setDate_Of_Updation(d);
		 menuTableRepository.save(dish_Name);
		
	}

}
