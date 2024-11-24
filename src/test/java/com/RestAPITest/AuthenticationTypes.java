package com.RestAPITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

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
public class AuthenticationTypes {
  @Test
  public void basicAuthentication() 
  {
	  Response res=given()
	  	.auth().basic("postman","password")
	  	
	  	.when().get("https://postman-echo.com/basic-auth");
	  
	  int code=res.getStatusCode();	 
	  System.out.println("Status code is: "+code);
	  
	  res.then().log().body();
	  
	  boolean status=res.jsonPath().getBoolean("authenticated");
	  Assert.assertEquals(status,true);
	  System.out.println("Basic authentication is completed!");
  }
  
  
  @Test
  public void digestAuth()
  {
	  Response res=given()
	  	.auth().digest("postman","password")
	  	
	  	.when().get("https://postman-echo.com/digest-auth");
	  	
	  System.out.println(res.getStatusCode());
	  
	  res.then().log().body();
	  
		  
  }
  
  @Test
  public void testbearerToken()
  {
	  Response res=given()
	  	.header("Authorization","Bearer 11111")
	  	
	  	.when().get("https://postman-echo.com");
	  
	  System.out.println(res.getStatusCode());
	  
	  res.then().log().body();
	 
  }
  
  @Test
  public void OAuth2Test()
  {
	  
	  Response res=given()
	  .auth().oauth2("12345")
	  .when().get("https://postman-echo.com");
	  
	  System.out.println(res.getStatusCode());
	  
	  res.then().log().body();
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
