package restassured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import commons.BaseTest;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import modelAPI.Student;

public class Restassured_03_PUT extends BaseTest{
	
	@Test
	public void Restassured_04_EditStudentInformation() {
		Student student = Student.getInstance();
		Response response = given().contentType(ContentType.JSON).when().body(student).put("/101");
		response.then().statusCode(200).body("msg", equalTo("Student Updated"));

		JsonPath jsonPath = given().when().get("/list").then().extract().body().jsonPath();
		List<Student> students = jsonPath.getList("", Student.class);
		Assert.assertEquals(students.get(100).getFirstName(), student.getFirstName());
	}
}
