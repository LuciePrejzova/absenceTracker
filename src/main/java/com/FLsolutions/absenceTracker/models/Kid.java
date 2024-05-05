package com.FLsolutions.absenceTracker.models;

import jakarta.persistence.*;
import java.util.List;
import com.FLsolutions.absenceTracker.models.DayType;

@Entity
@Table(name = "kids")
public class Kid extends User {

//	@ManyToMany(mappedBy = "kids")
//	private List<Parent> parents;
//	
//	@OneToMany(mappedBy = "kid", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
//	private List<Reservation> reservations;
//	
//	private List<SubstituteCredit> substitutes;
//	private List<Attendace> attendanceList;
	
	private DayType dayType;


	public Kid() {
		super();
	}

	public Kid(String firstName, String lastName) {
		super(firstName, lastName);
		this.dayType = dayType;
//		this.parents = parents;
	}

	public DayType getDayType() {
		return dayType;
	}

	public void setDayType(DayType dayType) {
		this.dayType = dayType;
	}
	
//    public List<Reservation> getReservations() {
//        return reservations;
//    }
//	
//    public void setReservations(List<Reservation> reservations) {
//        this.reservations = reservations;
//    }
//
//	public List<Parent> getParents() {
//		return parents;
//	}
//
//	public void setParents(List<Parent> parents) {
//		this.parents = parents;
//	}
    

}
