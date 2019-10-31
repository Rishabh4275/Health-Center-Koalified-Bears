package com.kolafied.bears.HealthCare.model;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;


@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RoomMenu implements Serializable {
    private Long roomId;

    private Long bedId;

    //getter, setter methods
    
    @Override
    public String toString() {
    	return "roomId = "+roomId+", bedId = "+bedId;
    }
}