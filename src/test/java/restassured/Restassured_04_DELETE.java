package restassured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import modelAPI.Student;

public class Restassured_04_DELETE {
	
	@BeforeTest
	public void beforeTest() {
		RestAssured.baseURI = "http://localhost";
		RestAssured.basePath = "/student";
		RestAssured.port = 8080;
	}

	@Test
	public void Restassured_05_DeleteUserByID() {
		// Prepare data
		Student student = Student.getInstance();
		given().log().all().contentType(ContentType.JSON)
		.when().body(student).post();
		
		// Call API to delete student
		Response response = given().contentType(ContentType.JSON).when().delete("/{id}", student.getId());
		response.then().statusCode(204);
	}
}
