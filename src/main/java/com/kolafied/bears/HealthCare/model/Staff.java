package com.kolafied.bears.HealthCare.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import java.util.List;


@Table(name = "staff_details")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Staff {

		
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long staff_id;
	    @NotBlank
	    private String name;
	    private String mobile;
	    
		private String email;
	    private String address;
	    
	    @ManyToMany
	    @JoinColumn(name="patientId")
	    private List<Patient> patientStaff;
	    
	    public Long getStaff_id() {
			return staff_id;
		}

		public void setStaff_id(Long staff_id) {
			this.staff_id = staff_id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

}
