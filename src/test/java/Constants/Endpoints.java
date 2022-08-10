package Constants;

import static io.restassured.RestAssured.baseURI;

public class Endpoints {

    public static final String BASE_URL =  baseURI = "https://reqres.in/api";
    public static final String GET_USERS_URL = "/users?page=2";

    public static final String CREATE_USERS = "/users?page=2";
    public static final String UPDATE_USER = "/users/2";

    public static final String DELETE_USER = "/users/2";
}
