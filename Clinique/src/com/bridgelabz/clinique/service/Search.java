package com.bridgelabz.clinique.service;

import java.util.Collection;
import java.util.Collections;

//import java.util.Collections;

import java.util.LinkedList;
import java.util.List;

import com.bridgelabz.clinique.model.Doctor;
import com.bridgelabz.clinique.model.Patient;

public class Search {
	Utility u=new Utility();
	List<Doctor>doctorList=new LinkedList<Doctor>();
	List<Patient>patientList=new LinkedList<Patient>();
	Doctor doctor=new Doctor();

	/* search doctors details by name 
	 * ----------------------------*/
	public List<Doctor>findByName(List<Doctor>list) {
		//public void findByName(List<Doctor>list) {
		System.out.println("enter doctors name to find");
		@SuppressWarnings("unused")
		String userInputDoc=Utility.StringScanner();
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getdName().equals(userInputDoc)) {
				//System.out.println("doctor name present = "+userInputDoc);
				//doctorList.add(list.get(i));
				System.out.println("Name="+list.get(i).toString());
			}
		}
		return doctorList;
	}
	/* search doctors details by id 
	 * -----------------------------*/
	public Doctor findById(List<Doctor>list,int did)
	{
		Doctor doc=null;
	 //System.out.println("enter the doctors id");
//		int userInputId=Utility.intScanner();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getdId()==did) {
				doc=list.get(i);
				//System.out.println("id="+list.get(i).toString());
			}
		}
		return  doc;
	}
	/* search doctors details by specialization 
	 * -----------------------------------------*/
	public List<Doctor>findBySpecialization(List<Doctor>list){
		System.out.println("enter which specialist you want to search");
		String userInputSpec=Utility.StringScanner();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getSpec().equals(userInputSpec)) {
				
				System.out.println("name="+list.get(i).toString());
			}
		}
		return doctorList;
	}
	
	/* search doctors details by availability 
	 * --------------------------------------*/
	
	@SuppressWarnings("static-access")
	public List<Doctor>findByAvailability(List<Doctor>list){
		System.out.println("enter you are prefering am or pm");
		String userInputAvail=u.StringScanner();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAvail().equals(userInputAvail)) {
				doctorList.add(list.get(i));
				System.out.println("name="+list.get(i).toString());
			}
		}
		return doctorList;
	}
	
	/* search patient details by name 
	 * ----------------------------*/
	//public List<Patient>findByPName(List<Patient>list) {
		public void findByPName(List<Patient>list) {
		System.out.println("enter patient name to find");
		@SuppressWarnings("unused")
		String userInputDoc=Utility.StringScanner();
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getpName().equals(userInputDoc)) {
				//patientList.add(list.get(i));
				System.out.println(list.get(i).toString());
			}
		}
		//return patientList;
	}
	
	/* search patient details by id 
	 * -----------------------------*/
	//public Patient findByPId(List<Patient>list){
	public void findByPId(List<Patient>list) {
		//Patient pat=null;
		System.out.println("enter the patient id");
		int userInputId=Utility.intScanner();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getpId()==userInputId) {
			
				System.out.println(list.get(i).toString());
			}
		}
		//return pat;
	}
	/* search patient details by age 
	 * ------------------------------*/
	
	public void findByPAge(List<Patient>list) {
		System.out.println("enter the age of the patient");
		int userInputAge=Utility.intScanner();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAge()==userInputAge) {
				//patientList.add(list.get(i));
				System.out.println(list.get(i).toString());
			}
		}
	}
	public Doctor findByIdDoctor(List<Doctor>list)
	{
		Doctor doc=null;
	 System.out.println("enter the doctors id");
		int userInputId=Utility.intScanner();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getdId()==userInputId) {
				doc=list.get(i);
				System.out.println("id="+list.get(i).toString());
			}
		}
		return  doc;
	}
	
	public void popularDoctor(List<Doctor>list) {
		int count=0;
//		int temp;
		for(int i=0;i<list.size();i++) {
			count=list.get(i).getAppointment();
			System.out.println(list.get(i).getdName()+"="+count);
		}
	}
}

//			for(int j=i+1;j<list.size();j++) {
//				if(i>j) {
//					temp=i;
//					i=j;
//					j=temp;
//				}
//			}
//		}
//	}
//}
