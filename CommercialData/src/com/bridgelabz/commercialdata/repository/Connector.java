package com.bridgelabz.commercialdata.repository;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.commercialdata.model.Company;
import com.bridgelabz.commercialdata.model.Customer;

public class Connector {
	static ObjectMapper mapper;
	static {
		mapper=new ObjectMapper();
	}
	File file=new File("company.json");
	File file1=new File("customer.json");
	
	public List<Company>readCompany(List<Company>list) throws  IOException{//read for company
		List<Company>companyList=mapper.readValue(file, new TypeReference<List<Company>>() {});
		return companyList;
	}
	@SuppressWarnings("deprecation")
	public List<Company>writeCompany(List<Company>list) throws  IOException{//write for company
		mapper.defaultPrettyPrintingWriter().writeValue(file, list);
		return list;
	}
	public List<Customer>readCustomer(List<Customer>list) throws  IOException{//read for customer
		List<Customer>CustomerList=mapper.readValue(file1, new TypeReference<List<Customer>>() {});
		return CustomerList;
	}
	@SuppressWarnings("deprecation")
	public List<Customer>writeCustomer(List<Customer>list) throws  IOException{//write for customer
		mapper.defaultPrettyPrintingWriter().writeValue(file1, list);
		return list;
   }
}
