package com.FLsolutions.absenceTracker.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FLsolutions.absenceTracker.dtos.KidResponseDto;
import com.FLsolutions.absenceTracker.services.KidService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MainController {
	private final KidService kidService;

	public MainController(KidService kidService) {
		this.kidService = kidService;
	}

	@GetMapping("/kids")
	public ResponseEntity<List<KidResponseDto>> index() {
		List<KidResponseDto> responseKidList = kidService.getAllKids();
		return new ResponseEntity<>(responseKidList, HttpStatus.OK);
	}

}
