package features;

import org.testng.annotations.Test;

import api.GetStudentAPI;
import commons.BaseTest;
import io.restassured.response.Response;

public class Restassured_01_GET extends BaseTest{
	GetStudentAPI getStudentAPI = new GetStudentAPI();
	
	@Test
	public void TC01_GET_GetAllInformation() {
		Response res = getStudentAPI.getAllStudent();
        res.then().statusCode(200);
	}
	
	@Test
	public void TC02_GET_GetStudentByID() {
		Response res = getStudentAPI.getStudentByID(1);
        res.then().statusCode(200);
	}
	
}
