package api;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import modelAPI.Student;

public class UpdateStudentInformationAPI {
	public Response updateStudentInformationByID(Student student) {
		return given().log().all()
				.contentType(ContentType.JSON)
				.when()
				.body(student)
				.put("/{id}", student.getId());
	}
}
