package com.swim.iservice;

import java.sql.SQLException;
import java.util.List;

import com.swim.domain.CourseComment;

public interface icommentservice {
		//���ۿγ�
		public List<CourseComment> submitCommentbyuser(int uid,int ctid,String content)throws SQLException, ClassNotFoundException;
		//��������
		public int goodComment(int uid,int ccid) throws SQLException, ClassNotFoundException;
		//��������
		public int badComment(int uid,int ccid) throws SQLException, ClassNotFoundException;
		//չʾ����
		public List<CourseComment> showCommentbypage(int ctid)throws SQLException, ClassNotFoundException;
		
}
