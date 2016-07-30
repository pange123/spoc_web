package com.spoc.po;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="apply")
public class Apply {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private int apply_id;
	 private String aname;
	 private String asex;
	 private String acollege;
	 private String agrade;
	 private String amajor;
	 private String aphone;
	 private String agroup;
	public int getApply_id() {
		return apply_id;
	}
	public void setApply_id(int apply_id) {
		this.apply_id = apply_id;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAsex() {
		return asex;
	}
	public void setAsex(String asex) {
		this.asex = asex;
	}
	public String getAcollege() {
		return acollege;
	}
	public void setAcollege(String acollege) {
		this.acollege = acollege;
	}
	public String getAgrade() {
		return agrade;
	}
	public void setAgrade(String agrade) {
		this.agrade = agrade;
	}
	public String getAmajor() {
		return amajor;
	}
	public void setAmajor(String amajor) {
		this.amajor = amajor;
	}
	public String getAphone() {
		return aphone;
	}
	public void setAphone(String aphone) {
		this.aphone = aphone;
	}
	public String getAgroup() {
		return agroup;
	}
	public void setAgroup(String agroup) {
		this.agroup = agroup;
	}
	public Apply( String aname, String asex, String acollege,
			String agrade, String amajor, String aphone, String agroup) {
		super();
		
		this.aname = aname;
		this.asex = asex;
		this.acollege = acollege;
		this.agrade = agrade;
		this.amajor = amajor;
		this.aphone = aphone;
		this.agroup = agroup;
	}
	public Apply() {
		super();
	}
	 
	 
}
