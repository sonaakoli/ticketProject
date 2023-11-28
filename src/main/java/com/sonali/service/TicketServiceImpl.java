package com.sonali.service;

import org.springframework.stereotype.Service;

import com.sonali.RequestBinding.Passenger;
import com.sonali.ResponceBinding.TicketResponce;
@Service
public class TicketServiceImpl implements TicketService{

	public TicketServiceImpl()
	{
	Passenger data= new Passenger();
	data.setFname("sonali");
	data.setLname("koli");
	data.setFrom("Sirpur");
	data.setTo("Pune");
	data.setDoj(10-11-2023);
	
	}

	@Override
	public TicketResponce psgTicket(Passenger data) {
		TicketResponce ticket= new TicketResponce();
		ticket.setPNR(1234);
		ticket.setTicketStatus("Confirmed");
		ticket.setTicketPrice(500.45);
		
		if(data!=null)
			return ticket;
		else
			return null;
	}
	
		
	
		
	
	
		
	}

