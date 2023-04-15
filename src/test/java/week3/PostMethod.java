package week3;

import io.restassured.http.*;
import io.restassured.response.*;
import org.junit.jupiter.api.*;
import week2.*;

import static io.restassured.RestAssured.given;

public class PostMethod extends TestBase {


    // add a new spartan  -- provide body as String
    @Test
    public void test1(){
        String body = "{\n" +
                "  \"gender\": \"Male\",\n" +
                "  \"name\": \"Micheal\",\n" +
                "  \"phone\": 5286394175\n" +
                "}";

        Response response = given().accept(ContentType.JSON)
                .and().contentType(ContentType.JSON)
                .and().body(body)
                .when().post("/api/spartans");

        response.prettyPrint();
        Assertions.assertEquals(201, response.statusCode());
        Assertions.assertEquals("A Spartan is Born!",response.path("success"));
    }
}
