package commons;

import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;

public class BaseTest {
	@BeforeTest
	public void beforeAll() {
		RestAssured.baseURI = "http://localhost";
        RestAssured.basePath = "";
        RestAssured.port = 8080;
	}
}
