package api;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;


public class GetStudentAPI {
	public Response getAllStudent() {
		return given().log().all()
				.when()
				.get("/list");
	}
	
	public Response getStudentByID(int id) {
		return given().log().all()
				.when()
				.get("/{id}", id);
	}
}
