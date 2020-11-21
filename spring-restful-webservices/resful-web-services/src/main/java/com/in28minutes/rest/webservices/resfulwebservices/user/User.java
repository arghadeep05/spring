package com.in28minutes.rest.webservices.resfulwebservices.user;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(description = "All details of user")
@Entity
public class User {
	@Id
	@GeneratedValue
	Integer id;
	@Size(min=2 ,message = "Minimum 2 characters required")
	String userName;
	@Past
	@ApiModelProperty(name="Birthday must be past date")
	Date dob;
	
	@OneToMany(mappedBy = "user")
	private List<Post> posts;
	
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	protected User() {
		
	}
	public User(Integer id, String userName, Date dob) {
		super();
		this.id = id;
		this.userName = userName;
		this.dob = dob;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
}
