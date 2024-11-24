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
public class HeadersandCookiesValidation {
  @Test
  public void testHeaders()
  {
	  Response res=given()
	  
			  	.when().get("https://www.google.com");
	  
	  //get the all headers in console
	  res.then().log().headers();
	  
	  //get the single header
	  String headervalue=res.getHeader("Content-Type");
	  Assert.assertEquals(headervalue,"text/html; charset=ISO-8859-1");
	  System.out.println("Header value is matched!");
	  

	  
	  
  }
  
  
  @Test
  public void testCookies()
  {
	  //cookies values are always dynamic
	  
	  Response res=given()
	  
	  .when().get("https://www.google.com");
	  
	  //get all cookies in console
	  res.then().log().cookies();
	  
	  //two cookies should not have same value
	  String exp="519=R4b9IYtv1oriqtrVHhU5jyO5y9kdDXCtSnG3cq1pPluDG5c9m5Rn6qaeTO0KByUxPtUZC9oPA_IGM9tC0CgPPhKe_IHVvdAXo5TTixScLmv_6aq2g7FVwwY6hso3osD_dawdDO76cuLHrxjVSV7TwJHGRHjyLESlbdDOzsuc3SS4fITUfcmynaQqr042FgSSb7aJ;Path=/;Domain=.google.com;HttpOnly;Expires=26/05/25, 3:16 pm";
	  
	  String cookie1=res.getCookie("NID");
	  
	  Assert.assertFalse(cookie1.equals(exp),"Test Fail: Cookies are equal!");
	  System.out.println("Test Pass: Cookies are not equal");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
  
  
  
}
