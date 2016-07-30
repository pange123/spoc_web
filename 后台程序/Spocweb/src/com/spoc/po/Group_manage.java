package com.spoc.po;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="group_manage")
public class Group_manage {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private int gid;
  private String gname;
  private String gdesc;
public int getGid() {
	return gid;
}
public void setGid(int gid) {
	this.gid = gid;
}
public String getGname() {
	return gname;
}
public void setGname(String gname) {
	this.gname = gname;
}
public String getGdesc() {
	return gdesc;
}
public void setGdesc(String gdesc) {
	this.gdesc = gdesc;
}
public Group_manage(String gname, String gdesc) {
	super();
	this.gname = gname;
	this.gdesc = gdesc;
}
public Group_manage() {
	super();
}
  
  
}
