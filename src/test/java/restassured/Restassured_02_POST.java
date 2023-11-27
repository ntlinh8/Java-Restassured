package restassured;

import org.testng.annotations.Test;

import commons.BaseTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import modelAPI.Student;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class Restassured_02_POST extends BaseTest{
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
