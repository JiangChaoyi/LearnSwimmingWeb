package com.swim.domain;
/**
 * �γ��ܱ�
 * @author Chan
 *
 */
public class coursetotal { 
	private int ctid;//�γ�����
	private String ctname;//�γ���
	private String teachername;//�γ̽�ʦ��
	private String studentnumber;//�γ��Ѿ������ѧ����Ŀ
	private String ctbrief;//�γ̼��
	private String img;//�γ̷���
	
	public String getCtname() {
		return ctname;
	}
	public void setCtname(String ctname) {
		this.ctname = ctname;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public String getStudentnumber() {
		return studentnumber;
	}
	public void setStudentnumber(String studentnumber) {
		this.studentnumber = studentnumber;
	}
	public String getCtbrief() {
		return ctbrief;
	}
	public void setCtbrief(String ctbrief) {
		this.ctbrief = ctbrief;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}

}
