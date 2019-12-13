package com.kolafied.bears.HealthCare.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Table(name = "patient_history")
@Entity

public class PatientHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long case_id;

    private Long patient_id;
    private String diagnose_code;
    private String insurance_id;
    private Date date_of_admission;
    private Long doctor_id;

	public Long getCase_id() {
		return case_id;
	}

	public void setCase_id(Long case_id) {
		this.case_id = case_id;
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


	public Long getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(Long patient_id) {
		this.patient_id = patient_id;
	}

	public Long getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(Long doctor_id) {
		this.doctor_id = doctor_id;
	}

}
