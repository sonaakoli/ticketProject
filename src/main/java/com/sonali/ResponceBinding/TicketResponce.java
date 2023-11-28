package com.sonali.ResponceBinding;




public class TicketResponce {
	private int PNR;
	private String ticketStatus;
	private Double ticketPrice;
	public int getPNR() {
		return PNR;
	}
	public void setPNR(int pNR) {
		PNR = pNR;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public Double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	@Override
	public String toString() {
		return "TicketResponce [PNR=" + PNR + ", ticketStatus=" + ticketStatus + ", ticketPrice=" + ticketPrice + "]";
	}

}
