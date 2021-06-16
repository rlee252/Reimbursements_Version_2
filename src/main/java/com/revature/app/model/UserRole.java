package com.revature.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ERS_USER_ROLES")
@Data @AllArgsConstructor @NoArgsConstructor
public class UserRole {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@JoinColumn(name = "role_id")
	int roleId;
	
	@Column(name = "role")
	String roleName;
}
