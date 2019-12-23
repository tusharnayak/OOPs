package com.bridgelabz.clinique.service;

import java.time.LocalDate;
import java.util.Date;

public class Appointment {
		Integer did;
		Date date;
		//LocalDate ldate;
		
		
		
//		public LocalDate getLdate() {
//			return ldate;
//		}
//
//		public void setLdate(LocalDate ldate) {
//			this.ldate = ldate;
//		}

		public Appointment() {
			// TODO Auto-generated constructor stub
		}
		//getter and setter methods
				
		public int getDid() 
		{
			return did;
		}
		public void setDid(int did) 
		{
			this.did = did;
		}

		public Date getDate() 
		{
			return getDate();
		}
		public void setDate(Date date) 
		{
			this.date = date;
		}

		public String toString() 
		{
			return "Appointment [did=" + did + ", date=" + date +  "]";
		}

		public int hashCode()
		{
	    	return this.did.hashCode()+this.date.hashCode();
		}
		//checking for equality
		public boolean equals(Object object)
		{
	    	if (object == null) 
				return false;
	    	if (object == this) 
				return true;
	    	if (!(object instanceof Appointment))
				return false;
	    	
	    	Appointment dA = (Appointment) object;

			if((this.did==dA.did) && (this.date.equals(dA.date)))
				return true;
			else
				return false;
		}

}
