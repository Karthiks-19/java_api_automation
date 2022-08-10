package methods;

import Constants.Endpoints;
import org.testng.annotations.Test;
import tests.BaseTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetUsers extends BaseTest {
//    @Test
//    public void test_1() {
//
//        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
//        System.out.println(response.getStatusCode());
//        System.out.println(response.getBody().asString());
//        int statusCode = response.getStatusCode();
//        Assert.assertEquals(statusCode, 200);
//    }

    // --> We can write in two ways, one is the above one, second one is below:

    @Test
    public static void test_2() {

        given().
                get(Endpoints.BASE_URL + Endpoints.GET_USERS_URL).
        then().
                statusCode(200).
                body("data[0].id",equalTo(7)).
                log().body();

    }


}
