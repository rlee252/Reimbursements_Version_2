package com.revature.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ERS_REIMBURSEMENT")
@Data @AllArgsConstructor @NoArgsConstructor
public class Reimbursement {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@JoinColumn(name = "reimbursement_id")
	int reimbursementId;
	
	@Column(name = "amount")
	double rAmount;
	
	@Column(name = "submitted")
	String rSubmitted;
	
	@Column(name = "resolved")
	String rResolved;
	
	@Column(name = "description")
	String rDescription;
	
	@Lob
	@Column(name = "receipt")
	byte[] rReceipt;
	
	@ManyToOne
	@JoinColumn(name = "author")
	User authorId;
	
	@ManyToOne
	@JoinColumn(name = "resolver")
	User resolverId;
	
	@ManyToOne
	@JoinColumn(name = "status_id", nullable = false)
	ReimbursementStatus status;
	
	@ManyToOne
	@JoinColumn(name = "type_id", nullable = false)
	ReimbursementType type;
}
