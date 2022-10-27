package stepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import org.apache.log4j.Logger;



public class API {

    public static Response response;
    public static RequestSpecification requestspecification;
    public static String base_URL = "https://samples.openweathermap.org/data/2.5/weather";

    public static Logger logger = Logger.getLogger(API.class);

    @Given("I provide API {string}")
    public void iProvideAPI(String URI) {
        RestAssured.baseURI = base_URL;
        requestspecification = RestAssured.given();
        response = requestspecification.when().get(URI);
    }

    @Then("I verify data")
    public void i_verify_data() {
        int status_code = response.then().extract().statusCode();
        Assert.assertEquals(200, status_code);

        JsonPath jsonpath = response.jsonPath();
        float longitude = jsonpath.get("coord.lon");
        float latitude = jsonpath.get("coord.lat");
        String description = jsonpath.get("weather[0].description");
        Object o = jsonpath.get("main.pressure");
        long pressure = ((Number) o).longValue();
        String country = jsonpath.get("sys.country");
        String name = jsonpath.get("name");


        //System.out.println("!!!PRINTING DATA!!!");
        logger.info("!!!PRINTING DATA!!!");
        //System.out.println("Longitude is: " + longitude);
        logger.info("Longitude is: " + longitude);
        //System.out.println("Latitude is: " + latitude);
        logger.info("Latitude is: " + latitude);
        //System.out.println("Description is: " + description);
        logger.info("Description is: " + description);
        //System.out.println("Pressure is: " + pressure);
        logger.info("Pressure is: " + pressure);
        //System.out.println("Country is: " + country);
        logger.info("Country is: " + country);
        //System.out.println("Name is: " + name);
        logger.info("Name is: " + name);
    }


}
