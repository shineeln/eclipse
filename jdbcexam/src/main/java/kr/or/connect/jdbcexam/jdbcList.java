package kr.or.connect.jdbcexam;

import java.util.ArrayList;
import java.util.List;

import kr.or.connect.jdbcexam.dao.RoleDao;
import kr.or.connect.jdbcexam.dto.Role;

public class jdbcList {
	
	public static void main(String[] args) {
		
		List<Role> list = new ArrayList<>();		
			
		RoleDao dao = new RoleDao();
		list = dao.getRoles();
		
		System.out.println(list);

		for(Role role : list) {
			System.out.println(role);	
		}
	}
	
}
