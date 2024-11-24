package com.RestAPITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
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

public class ParemetersTypeRequest {
  @Test
  public void testQueryPathParameters() 
  {
	  /*
	   * 
https://api.restful-api.dev/objects?id=3&id=5&id=10

BaseURL: https://api.restful-api.dev
path parameter: /objects
Query parameter:?id=3&id=5&id=10
	   */
	  
	 // RestAssured.baseURI="https://api.restful-api.dev";
	  
	  Response res=given()
	  .pathParam("path","/objects")
	  .queryParam("id",3)//first query parameter
	  .queryParam("id",5)//second query parameter
	  .queryParam("id",10)//Third query parameter
	  
	  //.when().get("{path}");//path=path+query
	  
	  .when().get("https://api.restful-api.dev/{path}");
	  //status code
	  
	 int code=res.getStatusCode();
	 Assert.assertEquals(code,200);
	 System.out.println("Status code is: "+code);
	 
	 //log the result
	 res.then().log().body();
	  
	  
	  
	  
	  
	  
  }
}
