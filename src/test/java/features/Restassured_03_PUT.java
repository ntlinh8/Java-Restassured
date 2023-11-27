package features;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.UpdateStudentInformationAPI;
import commons.BaseTest;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import modelAPI.Student;

public class Restassured_03_PUT extends BaseTest{
	UpdateStudentInformationAPI updateStudentInformation = new UpdateStudentInformationAPI();
	@Test
	public void Restassured_04_EditStudentInformation() {
		Student student = Student.getInstance();
		Response response = updateStudentInformation.updateStudentInformationByID(student);
		response.then().statusCode(200).body("msg", equalTo("Student Updated"));

		JsonPath jsonPath = given().when().get("/list").then().extract().body().jsonPath();
		List<Student> students = jsonPath.getList("", Student.class);
		Assert.assertEquals(students.get(student.getId()-1).getFirstName(), student.getFirstName());
	}
}
