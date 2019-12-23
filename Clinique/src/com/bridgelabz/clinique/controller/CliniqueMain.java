package com.bridgelabz.clinique.controller;

import java.io.IOException;

import java.time.LocalDateTime;
import java.util.List;
//import com.bridgelabz.clinique.model.AppointmentDate;
import com.bridgelabz.clinique.model.Doctor;
import com.bridgelabz.clinique.model.Patient;
import com.bridgelabz.clinique.repository.Connector;
//import com.bridgelabz.clinique.service.Appointment;
import com.bridgelabz.clinique.service.Operation;
import com.bridgelabz.clinique.service.Search;
import com.bridgelabz.clinique.service.Utility;

public class CliniqueMain {

	public static void main(String[] args) throws IOException {
		Doctor doctor = new Doctor();
		Connector conn = new Connector();
		Operation operator = new Operation();
		Search search1 = new Search();

		do {
			System.out.println("enter your choice");
			System.out.println("==================");
			System.out.println("1.add doctor");
			System.out.println("2.add patient");
			System.out.println("3.delete doctor");
			System.out.println("4.delete patient");
			System.out.println("5.search doctor");
			System.out.println("6.search patient");
			System.out.println("7.take appointment");
			

			int choice = Utility.intScanner();

			switch (choice) {
			case 1:
				List<Doctor> list = conn.readValue();

				List<Doctor> listOfDoctor = operator.addDoctor(list);
				conn.writeValue(listOfDoctor);
				break;

			case 2:
				List<Patient> list1 = conn.readPatientValue();
				List<Patient> listOfPatient = operator.addPatient(list1);
				conn.writeValueForPatient(listOfPatient);
				break;

			case 3:
				List<Doctor> list2 = conn.readValue();
				operator.deleteDoctor(list2);
				conn.writeValue(list2);
				break;

			case 4:
				List<Patient> list3 = conn.readPatientValue();
				operator.deletePatient(list3);
				conn.writeValueForPatient(list3);
				break;

			case 5:

				Search search = new Search();
				System.out.println("enter your choice");
				System.out.println("==================");
				System.out.println("1.search doctor by name");
				System.out.println("2.search doctor by id");
				System.out.println("3.search doctor by specialisation");
				System.out.println("4.search doctor by availability");

				int userChoice = Utility.intScanner();
				List<Doctor> listForSearch = conn.readValue();

				switch (userChoice) {
				case 1:
					search.findByName(listForSearch);
					break;

				case 2:
					search.findByIdDoctor(listForSearch);
					break;

				case 3:

					search.findBySpecialization(listForSearch);
					System.out.println("name=" + doctor.getdName() + " id=" + doctor.getdId() + " specialisation="
							+ doctor.getSpec() + " availability=" + doctor.getAvail());
					break;

				case 4:
					search.findByAvailability(listForSearch);
					System.out.println("name=" + doctor.getdName() + " id=" + doctor.getdId() + " specialisation="
							+ doctor.getSpec() + " availability=" + doctor.getAvail());
					break;
				}
				break;

			/* search for patient */
			case 6:

				System.out.println("enter your choice");
				System.out.println("==================");
				System.out.println("1.search patient by name");
				System.out.println("2.search patient by id");
				System.out.println("3.search patient by age");
				List<Patient> plist = conn.readPatientValue();

				int pchoice = Utility.intScanner();
				Search psearch = new Search();
				switch (pchoice) {
				case 1:
					psearch.findByPName(plist);
					break;

				case 2:
					psearch.findByPId(plist);
					break;

				case 3:
					psearch.findByPAge(plist);
					break;
				}

			case 7:
				Search searchForApp = new Search();
				System.out.println("Enter Doctor Id ");
				int did = Utility.intScanner();

				List<Doctor> alist = conn.readValue();
				Doctor doc = searchForApp.findById(alist, did);
				if (doc != null) {
					System.out.println("Enter the availablity");
					String avail = Utility.StringScanner();
					if (doc.getAvail().equals(avail)) {
						if (doc.getAppointment() < 5) {
							doc.setAppointment(doc.getAppointment() + 1);
							System.out.println("Appointed ");
							conn.writeApp(alist);
							} 
						else {
							// AppointmentDate appDate=new AppointmentDate();
							System.out.println("Get another shift or another doctor");
							// List<AppointmentDate>listTime=(List<AppointmentDate>) conn.readAppointment();
							LocalDateTime date = LocalDateTime.now().plusDays(1);
							// appDate.getLdate();
							conn.writeValueForAppointment(date);
							System.out.println("consult tomorrow at " + date);
						}

					} else {
						System.out.println("Doctor is not available at this shift");
					}
				}
				break;
//
//			case 8:
//				List<Doctor> doctorList = conn.readValue();
//				search1.popularDoctor(doctorList);
//				break;
			}
		} while (Utility.booleanScanner());

	}

}
