package api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import modelAPI.Student;
import static io.restassured.RestAssured.given;

public class CreateNewStudentAPI {
	public Response createNewStudent(Student student) {
		return given().log().all()
				.contentType(ContentType.JSON)
				.when()
				.body(student)
				.post();
	}
}
