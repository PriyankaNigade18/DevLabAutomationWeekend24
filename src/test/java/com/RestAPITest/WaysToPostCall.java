package com.RestAPITest;

import org.testng.annotations.Test;

import com.PojoClasses.AuthToken;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import java.util.HashMap;

/*
 * given()-prerequisite
 * ----------------
 * header,request payload,cookies,authentication,path parameters query parameters
 * 
 * when()-Request type
 * -----------------------
 * GET,POST,PUT,PATCH,DELETE
 * 
 * then()-validation
 * -------------------------
 * status code,message,response time,payload
 */
public class WaysToPostCall {
  @Test
  public void createTokenUsingHashMap()
  {
	  //Request payload
	 HashMap<String,Object> data=new HashMap<String,Object>();
	 data.put("username","admin");
	 data.put("password","password123");
	 
	  
	  Response res=given()
			  		.header("Content-Type","application/json")
			  			.body(data)
	  	
	  	.when().post("https://restful-booker.herokuapp.com/auth");
	  
	  
	  int statuscode=res.getStatusCode();
	  
	  assertEquals(statuscode,200);
	  System.out.println("Status code is matched!: "+statuscode);
	  
	  //printing response in console
	  res.then().log().body();
	  
	  //get the token
	  String token=res.jsonPath().getString("token");
	  System.out.println("Token generated is: "+token);
	  
	  
  }
  
  
  @Test
  public void createTokenUsingPOJOClass()
  {
	  
	  //Request payload
	  AuthToken auth=new AuthToken();
	  auth.setUsername("admin");
	  auth.setPassword("password123");
	  
	  Response res=given()
			  		.header("Content-Type","application/json")
			  			.body(auth)
	  	
			  			.when().post("https://restful-booker.herokuapp.com/auth");
	  
	  //get the log
	  
	  res.then().log().body();
	  int statuscode=res.getStatusCode();
	  assertEquals(statuscode,200);
	  System.out.println("Status code is matched!: "+statuscode);
	  
	//get the token
	  String token=res.jsonPath().getString("token");
	  System.out.println("Token generated is: "+token);
  }
}
