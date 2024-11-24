package com.RestAPITest;

import org.testng.annotations.Test;

import com.PojoClasses.AuthToken;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Searializationanddeserialization 
{
	/*
	 * POJO------>Json= Searialization
	 * Json--->Pojo-deserialization
	 */
  @Test
  public void testSerialization() throws JsonProcessingException
  {
	  //pojo
	  AuthToken auth=new AuthToken();
	  auth.setUsername("admin");
	  auth.setPassword("password123");
	  
	  //Pojo===>Json
	  ObjectMapper obj=new ObjectMapper();
	  String json=obj.writerWithDefaultPrettyPrinter().writeValueAsString(auth);
	  
	  System.out.println(json);
	  
	  
	  
	  
  }
  
  @Test
  public void testdeserialization() throws JsonMappingException, JsonProcessingException
  {
	  
	  String json="{\n"
	  		+ "  \"username\" : \"admin\",\n"
	  		+ "  \"password\" : \"password123\"\n"
	  		+ "}";
	  
	  
	  ObjectMapper obj=new ObjectMapper();
	  AuthToken auth=obj.readValue(json,AuthToken.class);
	  
	  System.out.println(auth.getUsername());
	  System.out.println(auth.getPassword());
	  
	  
	  
	  
	  
	  
  }
}
