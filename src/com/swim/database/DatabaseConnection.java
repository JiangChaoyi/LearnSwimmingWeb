package com.swim.database;
/** 
 *Connection to DBS Util
 */
import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class DatabaseConnection {
	private Connection con;
	
	private static final String url="jdbc:mysql://localhost:3306/Swimming?useSSL=false&"
			+ "useUnicode=true&characterEncoding=utf-8";
	//�û���
	private static final String username="root";
	//���ݿ��¼����
	private static final String password="Flowerrui";
	static {
		try {
			//�������ݿ�����
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e) {
			//��ӡ�쳣
			e.printStackTrace();
		}
	}
	//����һ�������������ݿ�
	public Connection openConnection()throws Exception{
		 con= (Connection) DriverManager.getConnection(url, username, password);
		 return con;
	}
	
}
