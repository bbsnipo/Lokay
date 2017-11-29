package com.dev.magne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="worldplaces")
public class lokaytorData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String str1;
	
	@Column
	private String str2;
	
	@Column
	private String str3;
	
	@Column
	private int locDate;
	
	@Column
	private int locTime;
	
	protected lokaytorData() {}
	
	public lokaytorData(String str1, String str2, String str3, int locDate, int locTime) {
		this.str1 = str1;
		this.str2 = str2;
		this.str3 = str3;
		this.locDate = locDate;
		this.locTime = locTime;
	}
	
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id=id;
	}
	
	public String getName() {
		return str1;
	}
	
	public void setName(String str1) {
		this.str1=str1;
	}
	
	public String getLoc() {
		return str2;
	}
	
	public void setLoc(String str2) {
		this.str2=str2;
	}
	
	
	public String getCom() {
		return str3;
	}
	
	public void setCom(String str3) {
		this.str3=str3;
	}

	
	public int getDat() {
		return locDate;
	}
	
	public void setDat(int dat) {
		this.locDate=dat;
	}
	
	public int getTim() {
		return locDate;
	}
	
	public void setTim(int tim) {
		this.locTime=tim;
	}
	
	@Override
	public String toString() {
		return String.format("lokaytorData[id=%d, str1='%s', str2='%s', str3='%s', locDate=%d, locTime=%d]", id, str1, str2, str3, locDate, locTime);
	}

}