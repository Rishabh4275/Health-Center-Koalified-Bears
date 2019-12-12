package com.kolafied.bears.HealthCare.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Table(name = "bill")
@Entity
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bId;
    @NotBlank
    private Date bDate;
    //private Long patientId;
    private String email;
    @NotBlank
    private Float bAmt;
    
    @OneToOne
    @JoinColumn(name="patientId")
    private Patient patientBill;
    
	public Long getbId() {
		return bId;
	}
	public void setbId(Long bId) {
		this.bId = bId;
	}
	public Date getbDate() {
		return bDate;
	}
	public void setbDate(Date bDate) {
		this.bDate = bDate;
	}
	public Long getPatientId() {
		return patientBill.getPatientId();
	}
	public void setPatientId(Long patientId) {
		this.patientBill.setPatientId(patientId);
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Float getbAmt() {
		return bAmt;
	}
	public void setbAmt(Float bAmt) {
		this.bAmt = bAmt;
	}
}
