package com.bridgelabz.clinique.repository;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.clinique.model.AppointmentDate;
import com.bridgelabz.clinique.model.Doctor;
import com.bridgelabz.clinique.model.Patient;
import com.bridgelabz.clinique.service.Appointment;

public class Connector {
	static ObjectMapper mapper;
	static {
		mapper=new ObjectMapper();
	}
	File docFile=new File("doctor1.json");
	File patFile=new File("patient1.json");
	File apfile=new File("appointment.json");
	File dateFile=new File("appointmentDate.json");
	
	/* read value for doctor 
	 * ---------------------*/
	public List<Doctor>readValue() throws JsonParseException, JsonMappingException, IOException{
		
		List<Doctor>list=mapper.readValue(docFile, new TypeReference <List<Doctor>>() {});
		
		return list;
	}

	/* write in file for doctor 
	 * -------------------------*/
	@SuppressWarnings("deprecation")

	public void writeValue(List<Doctor>listOfDoc) throws  IOException {
		
		mapper.defaultPrettyPrintingWriter().writeValue(docFile,listOfDoc);
		
	}
	/* read value for patient 
	 * ----------------------*/
	public List<Patient>readPatientValue() throws IOException{
		List<Patient>list=mapper.readValue(patFile, new TypeReference<List<Patient>>() {});
		return list;
	}

	/* write in json file for patient 
	 * -------------------------------*/
	@SuppressWarnings("deprecation")
	public void writeValueForPatient(List<Patient>listPat) throws  IOException {
		mapper.defaultPrettyPrintingWriter().writeValue(patFile, listPat);
	}
	
	/*
	 * read appointment 
	 * -----------------
	 */
	public HashMap<Appointment,Integer> readApp() throws IOException{
		HashMap<Appointment,Integer> Maplist = mapper.readValue(apfile, new TypeReference<HashMap<Appointment,Integer>>(){});
		return Maplist;
	}
	
	/*
	 * read value for appointment date 
	 * ---------------------------------
	 */
	public List<AppointmentDate>readAppointment() throws  IOException{
		List<AppointmentDate>list=mapper.readValue(dateFile,new TypeReference<List<Appointment>>() {});
		return list;
	}
	
	/*
	 * write value for appointment date
	 *  ---------------------------------
	 */
	public void writeValueForAppointment(LocalDateTime date) throws  IOException {
		mapper.defaultPrettyPrintingWriter().writeValue(dateFile, date);
	}
	
	@SuppressWarnings("deprecation")
	public void writeApp(Object listOfapp) throws  IOException {
		mapper.defaultPrettyPrintingWriter().writeValue(apfile,listOfapp);
		System.out.println("File has updated");
	}
	

}
