package week1;

import io.restassured.*;
import io.restassured.http.*;
import io.restassured.response.*;
import org.junit.jupiter.api.*;

public class FirstTest {

    @Test
    public void test1(){
        Response response = RestAssured.given().accept(ContentType.JSON)
                .when().get("http://3.216.30.92:8000/api/spartans");

        System.out.println(response.statusCode());
        Assertions.assertEquals(200,response.statusCode());

    }
}
