package com.app.dao;
import java.sql.*;
import com.app.db.Conexion;
import com.model.User;

public class UserDaoImpl extends Conexion implements UserDAO{

	@Override
	public void addUser(User user) {
		String sql = 
				"insert into users ("
				+ "user_first_name,user_last_name,user_email,"
				+ "user_initials,display_name,description,telephone,webpage,memberOf)"
				+ "values (?,?,?,?,?,?,?,?,?)";
		this.getConn();
		try {
			PreparedStatement ps = this.conn.prepareStatement(sql);
			ps.setString(1, user.getUser_first_name());
			ps.setString(2, user.getUser_last_name());
			ps.setString(3, user.getUser_email());
			ps.setString(4, user.getUser_initials());
			ps.setString(5, user.getDisplay_name());
			ps.setString(6, user.getDescription());
			ps.setString(7, user.getTelephone());
			ps.setString(8, user.getWebPage());
			ps.setString(9, user.getMemberOf());
			
			int i = ps.executeUpdate();
			if(i < 1) {
				System.out.println("did go through");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
