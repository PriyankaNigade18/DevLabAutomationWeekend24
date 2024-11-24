package com.RestAPITest;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PojoClasses.AuthToken;
import com.PojoClasses.HotelPojo;

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
public class TestHoteBookingAPIs
{
	
	 String token;
	 int id;
	 
  @Test(priority=1)
  public void getAllBookingIds()
  {
	  Response res=given()
			  			.when()
			  				.get("https://restful-booker.herokuapp.com/booking");
	  	
	  	//status code should be 200
	  	int code=res.getStatusCode();
	  	assertEquals(code,200);
	  	System.out.println("Status code matched!: code is"+code);
	  	
	  	//print all response in console
	  	res.then().log().all();
	  	
	  	
	  
  }
  
 
  
  @Test(priority=2)
  public void createNewBooking()
  {
	  //Request payload
	  HashMap<String,Object> dates=new HashMap<String,Object>();
	  dates.put("checkin","2024-11-24");
	  dates.put("checkout","2024-11-25");
	  
	  HotelPojo p1=new HotelPojo();
	  p1.setFirstname("Priyanka");
	  p1.setLastname("Nigade");
	  p1.setTotalprice(1000);
	  p1.setDepositpaid(true);
	  p1.setBookingdates(dates);
	  p1.setAdditionalneeds("lunch");
	  
	   Response res=given()
	  	.header("Content-Type","application/json")
//	  	.body("{\n"
//	  			+ "    \"firstname\" : \"Priyanka\",\n"
//	  			+ "    \"lastname\" : \"Nigade\",\n"
//	  			+ "    \"totalprice\" : 111,\n"
//	  			+ "    \"depositpaid\" : true,\n"
//	  			+ "    \"bookingdates\" : {\n"
//	  			+ "        \"checkin\" : \"2024-11-24\",\n"
//	  			+ "        \"checkout\" : \"2024-11-25\"\n"
//	  			+ "    },\n"
//	  			+ "    \"additionalneeds\" : \"Breakfast\"\n"
//	  			+ "}")
	  	.body(p1)
	  	
	  			.when().post("https://restful-booker.herokuapp.com/booking");
	  	
	   
	   int code=res.getStatusCode();
	   
	   assertEquals(code,200);
	   System.out.println("status code is matching!: "+code);
	   
	   //log the response
	   res.then().log().body();
	   
	   
	   //get the bookingid from response
	   
	   id=res.jsonPath().getInt("bookingid");
	   System.out.println("Booking id generated: "+id);
	   
	   	  
  }
  
  @Test(priority=3)
  public void getBookingDetailsForSameId()
  {
	  System.out.println("Get the details for same id: "+id);
	  Response res=given()
	  
			  .when().get("https://restful-booker.herokuapp.com/booking/"+id);
	  
	  //firstname=Priyanka
	  String name=res.jsonPath().getString("firstname");
	  Assert.assertEquals(name,"Priyanka");
	  System.out.println("Name is matching!: "+name);
	  
  }
  
 
  @Test(priority=4)
  public void createToken()
  {
	  
	//Request payload
	  AuthToken auth=new AuthToken();
	  auth.setUsername("admin");
	  auth.setPassword("password123");
	  
	  Response res=given()
			  		.header("Content-Type","application/json")
			  			.body(auth)
	  	
			  				.when().post("https://restful-booker.herokuapp.com/auth");
	  	
	  	int code=res.getStatusCode();
	  	Assert.assertEquals(code,200);
	  	System.out.println("Status code is: "+code);
	  	
	  	//geth the token
	  	 token=res.jsonPath().getString("token");
	  	System.out.println("Generated token is: "+token);
  }
  
  
  @Test(priority=5)
  public void partialUpdateBooking()
  {
	  System.out.println("Same booking id used to update booking: "+id);
	  //Payload
	  HotelPojo p1=new HotelPojo();
	  p1.setFirstname("Jay");
	  p1.setLastname("Nigade");
	  
	  Response res=given()
	  .header("Content-Type","application/json")
	  .header("Accept","application/json")
	  .header("Cookie","token="+token)
	  .body(p1)
	  
	  .when().patch("https://restful-booker.herokuapp.com/booking/"+id);
	  
	  //log the result
	  //res.then().log().body();
	  
	  System.out.println(res.asPrettyString());
	
//	  String name=res.jsonPath().getString("firstname");
//	  Assert.assertEquals(name,"Jay");
//	  System.out.println("Name matched: "+name);
	  
	  
  }
  
  
  
  
}
