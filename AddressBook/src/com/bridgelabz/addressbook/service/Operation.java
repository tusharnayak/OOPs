package com.bridgelabz.addressbook.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.bridgelabz.addressbook.model.Person;

public class Operation {
	Utility u=new Utility();
	
	/*
	 * METHOD FOR ADD USER 
	 * ---------------------
	 */
	public List<Person> addUser(List<Person>listOfPerson)
	{
		do {
			Person person=new Person();
		System.out.println("enter the first name ");
		person.setfName(Utility.StringScanner());
		
		System.out.println("enter the last name ");
		person.setlName(Utility.StringScanner());
		
		System.out.println("enter the address");
		person.setAddress(Utility.StringScanner());
		
		System.out.println("enter the phone number  ");
		long userNo=Utility.longScanner();
		person.setPhno(userNo);
		for(int i=0;i<listOfPerson.size();i++) {
			if(listOfPerson.get(i).getPhno()==userNo) {
				System.out.println("this phone number is available please try again!!!...");
			    addUser(listOfPerson);
			}
		}
		

		System.out.println("enter the city ");
		person.setCity(Utility.StringScanner());
		

		System.out.println("enter the state ");
		person.setState(Utility.StringScanner());
		

		System.out.println("enter the zip code ");
		person.setZip(Utility.longScanner());
		
		
		
		//person.setPhno(Utility.longScanner());
		
		listOfPerson.add(person);
		
		System.out.println("person added successfully");
		System.out.println("if you want to add more enter true");
		
		
		}
		while(Utility.booleanScanner());
		return listOfPerson;
	}
	
	/*
	 * METHOD FOR DELETE A USER
	 *  -------------------------
	 */
	public boolean deleteUser(List<Person>listOfPerson)
	{
		System.out.println("enter the first name");
		String fName=Utility.StringScanner();
		
		System.out.println("enter the last name");
		String lName=Utility.StringScanner();
		
		for(int i=0;i<listOfPerson.size();i++)
		{
			if(listOfPerson.get(i).getfName().equals(fName) && listOfPerson.get(i).getlName().equals(lName))
			{
				listOfPerson.remove(i);
				System.out.println("user removed");
				return true;
			}
		}
		return false;
		
	}
	
	/*
	 * METHOD FOR EDIT A USER DETAILS
	 *  -------------------------------
	 */
	
	public void editUser(List<Person>listOfPerson)
	{
		System.out.println("enter the person name");
		String name=Utility.StringScanner();
		
		for(int i=0;i<listOfPerson.size();i++)
		{
			
			if(listOfPerson.get(i).getfName().equals(name))
			{
				Person temp=listOfPerson.get(i);
				do {
					System.out.println("enter your choice for edit");
					System.out.println("1.address");
					System.out.println("2.phoneNumber");
					System.out.println("3.city");
					System.out.println("4.state");
					System.out.println("5.zip");
					int choice=Utility.intScanner();
					
					switch(choice) {
					case 1:
						System.out.println("enter address to edit");
						temp.setAddress(Utility.StringScanner());
						break;
						
					case 2:
						System.out.println("enter phone number to edit");
						temp.setPhno(Utility.longScanner());
						break;
						
					case 3:
						System.out.println("enter city to edit");
						temp.setCity(Utility.StringScanner());
						break;
						
					case 4:
						System.out.println("enter state to edit");
						temp.setState(Utility.StringScanner());
						break;
						
					case 5:
						System.out.println("enter zip to edit");
						temp.setZip(Utility.longScanner());
						break;
					}
					System.out.println("if you want to edit more thing then true");
				}
				while(Utility.booleanScanner());
			}
		}
	}
	
	public void sortUser(List<Person>list){ 
		List<Person>sortedList=list.stream().sorted(Comparator.comparing(Person::getlName)).collect(Collectors.toList());
		
		System.out.println("data sorted");
		for(Person person:sortedList)
			System.out.println(person.toString());
		//return sortedList;
		
	}
	public void sortByZip(List<Person>list) {
		Person person=new Person();
		for(int i=0;i<list.size()-1;i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i).getZip()>list.get(j).getZip()) {
					Person temp=list.get(i);
					list.set(i,list.get(j));
					list.set(j,temp);
				}
			}
				
		}
		System.out.println(list.toString());

	}
	
	public void printUser(List<Person>list) {
		System.out.println("enter the user name");
		String fname=Utility.StringScanner();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getfName().equals(fname)) {
				Person temp=list.get(i);
				System.out.println("name="+temp.getfName()+" "+temp.getlName()+" city= "+temp.getCity()+" ph no= "+temp.getPhno()+" state= "+temp.getState()+" zip= "+temp.getZip());
			}
		}
	}

}
