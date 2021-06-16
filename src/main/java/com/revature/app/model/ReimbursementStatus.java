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
@Table(name="ERS_REIMBURSEMENT_STATUS")
@Data @AllArgsConstructor @NoArgsConstructor
public class ReimbursementStatus {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@JoinColumn(name = "status_id")
	int statusId;
	
	@Column(name = "status")
	String statusName;
}

