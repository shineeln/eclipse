package kr.or.connect.jdbcexam;

import kr.or.connect.jdbcexam.dao.RoleDao;

public class jdbcDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int roleId = 500;
		
		RoleDao dao = new RoleDao();
		int deleteCount = dao.deleteRole(roleId);
		
		System.out.println(deleteCount);
	}

}
