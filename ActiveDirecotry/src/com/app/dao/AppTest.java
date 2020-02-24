package com.app.dao;

import java.util.ArrayList;
import java.util.List;

import com.model.User;

public class AppTest{

	public static void main(String[] args) {	
		UserDaoImpl d = new UserDaoImpl();

		List<User>list = d.listar();
		
		List<String>l = new ArrayList<>();
		l.add("one");
		l.add("two");
		l.add("three");		
		System.out.println(l);
		
		for(int i = 0; i < list.size();i++) {
			
			System.out.println(list.get(i).getUser_first_name()+" \n");
			
		}
	}

}
