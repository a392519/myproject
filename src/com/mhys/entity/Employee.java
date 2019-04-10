package com.mhys.entity;

public class Employee {
	private int empId,empSex,empAge,empYear,postId;
	private String empName,empDepart;
	private Post post;
	
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpSex() {
		return empSex;
	}
	public void setEmpSex(int empSex) {
		this.empSex = empSex;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public int getEmpYear() {
		return empYear;
	}
	public void setEmpYear(int empYear) {
		this.empYear = empYear;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDepart() {
		return empDepart;
	}
	public void setEmpDepart(String empDepart) {
		this.empDepart = empDepart;
	}
	
}
