package com.kolafied.bears.HealthCare.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Table(name="patient_history")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
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
}
