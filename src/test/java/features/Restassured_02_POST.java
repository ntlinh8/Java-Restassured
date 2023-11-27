package features;

import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

import api.CreateNewStudentAPI;
import commons.BaseTest;
import io.restassured.response.Response;
import modelAPI.Student;

public class Restassured_02_POST extends BaseTest{
	CreateNewStudentAPI createNewStudent = new CreateNewStudentAPI();
	
	@Test
	public void TC03_POST_AddNewStudent() {
        Student student = Student.getInstance();
        Response res = createNewStudent.createNewStudent(student);
        res.prettyPrint();
        res.then().statusCode(201).body("msg", equalTo("Student added"));
        
	}
	
}
