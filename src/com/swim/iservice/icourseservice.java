package com.swim.iservice;

import java.sql.SQLException;
import java.util.List;

import com.swim.domain.course;
import com.swim.domain.courseprogress;
import com.swim.domain.coursetotal;

public interface icourseservice {
	//���Ŀγ�
	public List<coursetotal> subscribeCoursebyuser(int uid,int ctid) throws SQLException, ClassNotFoundException;
	//��¼ѧϰ����
	public List<courseprogress> learnCoursebyuser(int uid,int ctid,int chid) throws SQLException, ClassNotFoundException;
	//�������û��γ̵�չʾ
	public List<coursetotal> showCoursebynewuser(int uid,int ctid)throws SQLException,ClassNotFoundException;
	//�����Ѿ�ѧϰ������γ̵��û���չʾ
	public List<coursetotal> showCoursebyolduser(int uid,int ctid)throws SQLException,ClassNotFoundException;
	//չ�־���γ��½�
	public List<course> showCourseChapter(int ctid)throws SQLException,ClassNotFoundException;
}
