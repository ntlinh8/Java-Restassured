package commons;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.restassured.RestAssured;

public class BaseTest {
	
	@Parameters({"environment"})
	@BeforeTest
	public void beforeAll(String environment) throws Exception {
		switch (environment) {
		case "dev":
			RestAssured.baseURI = GlobalConstants.BASE_URL_DEV;
			break;
		case "test":
			RestAssured.baseURI = GlobalConstants.BASE_URL_TEST;
			break;
		default:
			throw new Exception("Please enter the valid environment");
		}
        RestAssured.basePath = GlobalConstants.BASE_PATH;
        RestAssured.port = GlobalConstants.BASE_PORT;
	}
}
