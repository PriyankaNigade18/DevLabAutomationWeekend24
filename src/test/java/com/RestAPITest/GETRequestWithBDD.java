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
public class GETRequestWithBDD {
  @Test
  public void singleObjectTest()
  {
	  Response res=given()
	  
			  .when()
			  .get("https://api.restful-api.dev/objects/7");
	  
	  int statuscode=res.getStatusCode();
	  Assert.assertEquals(statuscode,200);
	  System.out.println("Status code is matched!");
	  
	  String size=res.jsonPath().getString("data['Hard disk size']");
	  Assert.assertEquals(size,"1 TB");
	  System.out.println("Hard disk size matched!");
	  
//	  .then()
//	  .statusCode(200)
//	  .log().all();
	  
	  
	  
	  
  }
}
