package com.kolafied.bears.HealthCare.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table(name="patient_history")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
public class Patient_History {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int case_id;
	@NotBlank
	private int patient_id;
	private String diagnose_code;
	private String insurance_id;
	@NotBlank
	private Date date_of_admission;
	
    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;

	public int getCase_id() {
		return case_id;
	}

	public void setCase_id(int case_id) {
		this.case_id = case_id;
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public String getDiagnose_code() {
		return diagnose_code;
	}

	public void setDiagnose_code(String diagnose_code) {
		this.diagnose_code = diagnose_code;
	}

	public String getInsurance_id() {
		return insurance_id;
	}

	public void setInsurance_id(String insurance_id) {
		this.insurance_id = insurance_id;
	}

	public Date getDate_of_admission() {
		return date_of_admission;
	}

	public void setDate_of_admission(Date date_of_admission) {
		this.date_of_admission = date_of_admission;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}
