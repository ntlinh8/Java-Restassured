package restassured;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class Restassured_01_GET {
	@BeforeTest
	public void beforeTest() {
		RestAssured.baseURI = "http://localhost";
        RestAssured.basePath = "";
        RestAssured.port = 8080;
	}
	
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
