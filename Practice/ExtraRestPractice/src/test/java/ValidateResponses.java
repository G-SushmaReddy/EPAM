import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ValidateResponses {

    @Test
    public void testResponseStatusCode() {
        // Perform the GET request and validate response in one step
        Response response = given()
                .baseUri("https://api.zippopotam.us") // Base URI
                .when()
                .get("/us/33162") // Specify the endpoint
                .then()
                .statusCode(200)  // Validate body field
                .extract()
                .response(); // Extract the response here

        // Print the response header and body
        System.out.println("Content-Type: " + response.getHeader("Content-Type"));
        System.out.println("Response Body: " + response.getBody().asString());

        // Extracting "post code" as a string
        String postCode = response.jsonPath().getString("country abbreviation");
        System.out.println("Post Code: " + postCode);
    }
}