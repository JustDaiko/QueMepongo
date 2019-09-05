package com.quemepongo.springapp.business.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.quemepongo.springapp.web.pojo.login.UserView;

@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "username")
	private String userName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	public boolean tryLogin(UserView pUser) {
		if(userName.equals(pUser.getUserName()) && password.equals(pUser.getPassword())) {
			return true;
		}
		return false;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("UserName: " + getUserName());
        return buffer.toString();
    }
}
