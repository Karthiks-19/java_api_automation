package methods;

import Constants.Endpoints;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class UpdateAndDeleteUsers {

    @Test
    public static void updateUser() {

        JSONObject request = new JSONObject();

        request.put("name", "karthik");
           request.put("job", "Software engg");
        System.out.println(request);

        given().
                contentType(ContentType.JSON).
                when().
                put(Endpoints.BASE_URL + Endpoints.UPDATE_USER).
                then().
                statusCode(200).
                log().body();

    }

    @Test
    public static void deleteUser() {

        when().
                delete(Endpoints.BASE_URL + Endpoints.DELETE_USER).
        then().
                statusCode(204).
                log().body();
    }
}
