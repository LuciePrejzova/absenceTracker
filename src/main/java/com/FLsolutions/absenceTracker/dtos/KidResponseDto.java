package com.FLsolutions.absenceTracker.dtos;

//import com.FLsolutions.absenceTracker.models.DayType;
import com.FLsolutions.absenceTracker.models.Kid;

public class KidResponseDto implements ResponseDto {

	private final Long sysId;
	private final String firstName;
	private final String lastName;
//	private final DayType dayType;

	public KidResponseDto(Kid kid) {
		this.sysId = kid.getSysId();
		this.firstName = kid.getFirstName();
		this.lastName = kid.getLastName();
//		this.dayType = kid.getDayType();
	}

	
	
	public Long getSysId() {
		return sysId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

//	public DayType getDayType() {
//		return dayType;
//	}

}
