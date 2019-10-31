package com.kolafied.bears.HealthCare.model;


import javax.persistence.Entity;
import javax.persistence.EmbeddedId;

import javax.persistence.EntityListeners;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.Getter;
import javax.validation.constraints.NotBlank;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.kolafied.bears.HealthCare.model.RoomMenu;





@Table(name = "room")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class Room {
	
	@EmbeddedId
	private RoomMenu roomMenu;
	
	@NotBlank
	private String roomType;
	private Long patientId;
	private String availability;
	
	
	public Room(Long roomId, String bedId, String roomType, Long patientId, String availability) {
		this.roomMenu=new RoomMenu(roomId,bedId);
		this.roomType=roomType;
		this.patientId=patientId;
		this.availability=availability;
	}
}


