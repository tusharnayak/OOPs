package com.bridgelabz.oops.repository;

import java.io.File;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.oops.model.Inventory;
import com.bridgelabz.oops.service.ServiceImpl;

public class Connector {
	static ObjectMapper mapper; // this is mapper class object to read and write the value
	static {
		mapper = new ObjectMapper();
	}

	File file = new File("json1.json");

	/*
	 * FOR READ DATA FROM JSON FILE 
	 * ------------------------------
	 */

	public List<Inventory> readFile() throws JsonParseException, JsonMappingException, IOException {
    List<Inventory> listInventory = mapper.readValue(file, new TypeReference<List<Inventory>>(){});
		return listInventory;
	}

	/*
	 * CONVERT JAVA OBJECT TO JSON 
	 * -----------------------------
	 */
	ServiceImpl implementation=new ServiceImpl();
	// @SuppressWarnings("deprecation")
	public void writeFile(List<Inventory> listOfInventory)throws JsonGenerationException, JsonMappingException, IOException {
		mapper.defaultPrettyPrintingWriter().writeValue(file, listOfInventory);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	 ServiceImpl impl=new ServiceImpl();
//	String jsonResult="";
//   jsonResult=mapper.writeValueAsString(listInventory);

	// impl.addInventory();
	// return jsonResult;

//	  public static String writeFileString(Object object) { String jsonResult="";
//	 try { jsonResult=mapper.writeValueAsString(object); } catch (IOException e) {
//	  // TODO Auto-generated catch block e.printStackTrace(); } return jsonResult;
//	  }
	 



}
