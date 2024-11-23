package com.RestAPITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RequestWithoutBDD {
  @Test
  public void SingleObject()
  {
	  Response res=RestAssured.get("https://api.restful-api.dev/objects/7");
	  System.out.println("Status code is: "+res.statusCode());
	  System.out.println("Status message is: "+res.statusLine());
	  System.out.println("******Response in Text format******");
	  System.out.println(res.asString());
	  System.out.println("******Response in Json format******");
	  System.out.println(res.asPrettyString());
	  
	  //json validation
	  String id=res.jsonPath().getString("id");
	 Assert.assertEquals(id,"7","Id is not matched!");
	 System.out.println("Id is matched!");
	  
	  //validate "year": 2019
	  int year=res.jsonPath().getInt("data.year");
	  Assert.assertEquals(year,2019,"Year is not matched!");
	  System.out.println("Year id matched!");
	  
	  
	  
  }
}
