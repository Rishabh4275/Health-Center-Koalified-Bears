package com.kolafied.bears.HealthCare.model;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class RoomMenu implements Serializable {
    private Long roomId;

    private Long bedId;

    //getter, setter methods
    
    @Override
    public String toString() {
    	return "roomId = "+roomId+", bedId = "+bedId;
    }

	public RoomMenu(Long roomId, Long bedId) {
		super();
		this.roomId = roomId;
		this.bedId = bedId;
	}

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public Long getBedId() {
		return bedId;
	}

	public void setBedId(Long bedId) {
		this.bedId = bedId;
	}
    
}