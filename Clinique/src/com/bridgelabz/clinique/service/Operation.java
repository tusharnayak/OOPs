package com.bridgelabz.clinique.service;

import java.util.List;

import com.bridgelabz.clinique.model.Doctor;
import com.bridgelabz.clinique.model.Patient;

public class Operation {
	Utility u=new Utility();

	/* TO ADD THE DOCTOR DETAILS 
	 * ---------------------------*/
	public List<Doctor> addDoctor(List<Doctor>list)
	{
		do {
			
		Doctor doctor=new Doctor();
		
		System.out.println("enter the name of doctor");
		doctor.setdName(u.StringScanner());
		
		System.out.println("enter the doctors id");
		int docId=u.intScanner();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getdId()==docId) {
				System.out.println("this doctor id is available...put another doctor id");
				addDoctor(list);
			}
		}
		System.out.println("enter the doctors specialization");
		doctor.setSpec(u.StringScanner());
		
		System.out.println("enter the shift of doctor");
		doctor.setAvail(u.StringScanner());
		
		System.out.println("enter the number of appointment of a doctor");
		doctor.setAppointment(u.intScanner());
		
		list.add(doctor);
		System.out.println("if you want to add more doctor enter true");
		}
		while(u.booleanScanner());
		System.out.println("operation performed...");
		return list;
	}

	/* TO ADD THE PATIENT DETAILS 
	 * ----------------------------*/
	public List<Patient>addPatient(List<Patient>list) {
		do {
			Patient patient=new Patient();
			
			System.out.println("enter the name of patient");
			patient.setpName(u.StringScanner());
			
			System.out.println("enter the patient id");
			int patNo=u.intScanner();
			for(int i=0;i<list.size();i++) {
				if(list.get(i).getpId()==patNo) {
					System.out.println("patient number already available!!!!please enter another id...");
					addPatient(list);
					}
		       }
			System.out.println("enter the mobile number of patient");
			patient.setMobno(u.longScanner());
			
			System.out.println("enter the age of patient");
			patient.setAge(u.intScanner());
			list.add(patient);
			
			System.out.println("if you want to perform more then enter true");
		}while(u.booleanScanner());
		System.out.println("operation performed...");
		return list;
	}
	/* TO DELETE THE DOCTOR DATA 
	 * ---------------------------*/
	
	public boolean deleteDoctor(List<Doctor>list)
	{
		System.out.println("enter the doctor name you want to delete");
		String userInput=u.StringScanner();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getdName().equals(userInput)) {
				list.remove(i);
				System.out.println("doctor name deleted successfully");
				return true;
			}
		}
		return false;
		
	}

	/* TO DELETE THE PATIENT DATA 
	 * ----------------------------*/
	public boolean deletePatient(List<Patient>list) {
		System.out.println("enter the patient name you want to delete");
		String userInput=u.StringScanner();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getpName().equals(userInput)) {
				list.remove(i);
				System.out.println("patient name deleted successfully");
				return true;
			}
		}
		return false;
	}
}
