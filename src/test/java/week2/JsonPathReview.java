package week2;

import io.restassured.*;
import io.restassured.http.*;
import io.restassured.path.json.*;
import io.restassured.response.*;
import org.junit.jupiter.api.*;

import java.util.*;

public class JsonPathReview {

    @Test
    public void test1(){

        Response response = RestAssured.given().accept(ContentType.JSON)
                .when().get("http://3.216.30.92:8000/api/spartans/1");

        response.prettyPrint();

        io.restassured.path.json.JsonPath jsonPath = response.jsonPath();

        System.out.println(jsonPath.get("id").toString());
        System.out.println(jsonPath.getString("name"));
        System.out.println(jsonPath.getInt("id"));
        System.out.println(jsonPath.getLong("phone"));

    }

    @Test
    public void test2(){
        Response response = RestAssured.given().accept(ContentType.JSON)
                .when().get("http://3.216.30.92:8000/api/spartans");

        response.prettyPrint();

        JsonPath jsonPath = response.jsonPath();
        List<String> names = jsonPath.getList("name");
        System.out.println(names);

        List<Integer> ids = jsonPath.getList("id");


    }

    @Test
    public void test3(){

        Response response = RestAssured.given().accept(ContentType.JSON)
                .when().get("https://api.zippopotam.us/us/90210");

        JsonPath jsonPath = response.jsonPath();

        String countryAbb = jsonPath.getString("country");
        System.out.println(countryAbb);
    }
}
