package com.swim.iservice;

import java.sql.SQLException;
import java.util.List;

import com.swim.domain.User;


public interface iuserservice {
	public User login(User u) throws ClassNotFoundException, SQLException;
	public User register(User u) throws ClassNotFoundException, SQLException;
	public User changeassword(User u,String repassword) throws ClassNotFoundException, SQLException;
	public User changenfo(User u)throws ClassNotFoundException, SQLException;
	//public List<String> getallUserinformation(int uid)throws ClassNotFoundException, SQLException;
	//�������й�ע�Ŀγ�
	public List<String> getallCoursebyuid(int uid) throws ClassNotFoundException, SQLException;
	
	

	

}
