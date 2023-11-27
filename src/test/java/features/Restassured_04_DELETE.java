package features;

import org.testng.annotations.Test;

import api.CreateNewStudentAPI;
import api.DeleteStudentAPI;
import commons.BaseTest;
import io.restassured.response.Response;
import modelAPI.Student;

public class Restassured_04_DELETE extends BaseTest{
	CreateNewStudentAPI createStudent = new CreateNewStudentAPI();
	DeleteStudentAPI deleteStudent = new DeleteStudentAPI();
	
	@Test
	public void Restassured_05_DeleteUserByID() {
		// Prepare data
		Student student = Student.getInstance();
		createStudent.createNewStudent(student);
		
		// Call API to delete student
		Response response = deleteStudent.deleteStudentByID(student.getId());
		response.then().statusCode(204);
	}
}
