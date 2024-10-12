package com.syed.springbootredisdb.model;

import java.io.Serializable;

public class Student implements Serializable{
	
	private static final long serialVersionUID = -5441991098250698202L;
	private Integer stdId;
	private String stdName;
	private Double stdFee;
	
	public Student()
	{
		
	}	
	public Student(Integer stdId, String stdName, Double stdFee) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdFee = stdFee;
	}
	public Integer getStdId() {
		return stdId;
	}
	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public Double getStdFee() {
		return stdFee;
	}
	public void setStdFee(Double stdFee) {
		this.stdFee = stdFee;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdFee=" + stdFee + "]";
	}
	
     
}
