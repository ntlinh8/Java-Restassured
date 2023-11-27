package api;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DeleteStudentAPI {
	
	public Response deleteStudentByID(int id) {
		return given().log().all()
				.contentType(ContentType.JSON)
				.when()
				.delete("/{id}", id);
	}
}
