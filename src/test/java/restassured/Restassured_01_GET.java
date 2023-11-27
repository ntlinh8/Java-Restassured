package restassured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import commons.BaseTest;
import io.restassured.response.Response;

public class Restassured_01_GET extends BaseTest{
	
	@Test
	public void TC01_GET_GetAllInformation() {
		Response res = given().when().get("/student/list");
        res.then().statusCode(200);
	}
	
	@Test
	public void TC02_GET_GetHomePage() {
		Response res = given().when().get("/");
        res.then().statusCode(200);
	}
	
}
