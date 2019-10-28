


package com.kolafied.bears.HealthCare.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotBlank;


@Table(name="doctor_details")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class Doctors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doctor_id;
    @NotBlank
	private String first_name;
	private String last_name;
	@NotBlank
	private String specialization;
	private int mobile;
	@NotBlank
	private String email;
	private String address;
	

}
