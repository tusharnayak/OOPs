package com.bridgelabz.oops.repository;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.oops.model.Customer;
import com.bridgelabz.oops.model.Inventory;
import com.bridgelabz.oops.model.Stock;
import com.bridgelabz.oops.service.StockImplement;

public class StockConnector {
	static ObjectMapper mapper;
	static {
		mapper=new ObjectMapper();
	}
     File file=new File("stock1.json");
     File file1=new File("stockCustomer.json");
     
     
	/*
	 * this method is used for getting data from json 
	 * 
	 */
     
     public List<Stock> readFile() throws  IOException
     {
    	 //System.out.println("hhh");
    	 //List<Stock> listStock = mapper.readValue(file, new TypeReference<List<Stock>>() {});
    	 
    	 List<Stock> listStock = mapper.readValue(file, new TypeReference<List<Stock>>(){});
    	
		return listStock;
     }
	/*
	 * FOR WRITE THE DATA 
	 * --------------------
	 */
     public  void writeFile(List<Stock>listStock) throws IOException
     {
    	 //StockImplement implement=new StockImplement();
    	 
    	 mapper.defaultPrettyPrintingWriter().writeValue(file, listStock);
    	// mapper.writeValue(file, listStock);
		
    	 
     }
     
     
//     public List<Customer> readFileCustomer() throws  IOException// for read customer file
//     {
//    	 
//    	 List<Customer> list = mapper.readValue(file, new TypeReference<List<Customer>>(){});
//    	
//		return list;
//     }
//     public  void writeFileCustomer(List<Customer>listCustomer) throws IOException//for write customer file
//     {
//    	 
//    	 mapper.defaultPrettyPrintingWriter().writeValue(file, listCustomer);
//    	
//		
//    	 
//     }
}
