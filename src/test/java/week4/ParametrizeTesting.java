package week4;

import io.restassured.*;
import io.restassured.http.*;
import io.restassured.response.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import week2.*;

public class ParametrizeTesting extends TestBase {

    /*
    we have 4 ways to provide data to test
    1. value source
    2. method source
    3. csv source
    4. csv file source

     */


    @ParameterizedTest
    @ValueSource(ints = {4,6,7,8,9})
    @Test
    public void test1(int id){
        Response response = RestAssured.given().accept(ContentType.JSON)
                .when().get("http://3.216.30.92:8000/api/spartans/"+ id + "");
        response.prettyPrint();
    }
}
