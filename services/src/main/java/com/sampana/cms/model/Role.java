package com.sampana.cms.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Roles")
public class Role extends Base {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "role")
    private String role;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
    
}
