package methods;

import Constants.Endpoints;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import tests.BaseTest;

import static io.restassured.RestAssured.given;

public class CreateUser extends BaseTest {

    @Test
    public static void createUser() {

        JSONObject request = new JSONObject();

        request.put("name", "karthik");
        request.put("job", "Software");
        System.out.println(request);

        given().
                contentType(ContentType.JSON).
        when().
                post(Endpoints.BASE_URL + Endpoints.CREATE_USERS).
        then().
                statusCode(201).
                log().body();

    }
}
