package com.sonali.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sonali.RequestBinding.Passenger;
import com.sonali.ResponceBinding.TicketResponce;
import com.sonali.service.TicketService;

@RestController
public class TicketController {
	@Autowired
	private TicketService ticketService;
	@PostMapping(value = "/getTicketDetails", produces = "application/json" ,consumes="application/json")
	public ResponseEntity<TicketResponce> getTicketDetails(@RequestBody Passenger data)
	{
		TicketResponce psgTicket = ticketService.psgTicket(data);

		return new ResponseEntity<TicketResponce>(psgTicket,HttpStatus.OK);
		
		
	}
	

}
 