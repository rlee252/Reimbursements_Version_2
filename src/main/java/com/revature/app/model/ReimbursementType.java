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
@Table(name="ERS_REIMBURSEMENT_TYPE")
@Data @AllArgsConstructor @NoArgsConstructor
public class ReimbursementType {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@JoinColumn(name = "type_id")
	int typeId;
	
	@Column(name = "type")
	String typeName;
}
