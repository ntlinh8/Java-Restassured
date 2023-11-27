package restassured;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import modelAPI.Student;

public class Restassured_02_POST {
	@BeforeTest
	public void beforeTest() {
		RestAssured.baseURI = "http://localhost";
		RestAssured.basePath = "/student";
		RestAssured.port = 8080;
	}
	
	@Test
	public void TC03_POST_AddNewStudent() {
        Student student = Student.getInstance();
        Response res = given()
                .contentType(ContentType.JSON)
                .when()
                .body(student)
                .post();
        res.prettyPrint();
        res.then().statusCode(201).body("msg", equalTo("Student added"));
        
	}
	
}
