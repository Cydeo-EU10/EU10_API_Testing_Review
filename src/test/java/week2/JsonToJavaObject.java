package week2;

import io.restassured.http.*;
import io.restassured.path.json.*;
import io.restassured.response.*;
import org.junit.jupiter.api.*;

import java.util.*;

import static io.restassured.RestAssured.given;

public class JsonToJavaObject extends TestBase {

    // json to java -- deserilization
    // java to json -- serilazation


    // deserilization   json to list
    @Test
    public void test1() {
        Response response = given().accept(ContentType.JSON)
                .when().get("/api/spartans");
        response.prettyPrint();

        List<Map<String, Object>> spartans = response.as(List.class);
        System.out.println(spartans);

    }

    // deserilization   json to list
    @Test
    public void test2() {
        Response response = given().accept(ContentType.JSON)
                .when().get("/api/spartans/5");
        response.prettyPrint();

        Map<String, Object> sparan5 = response.as(Map.class);
        System.out.println(sparan5);

        Assertions.assertEquals("Blythe",sparan5.get("name"));
    }

    @Test
    public void test3(){
        Response response = given().accept(ContentType.JSON)
                .when().get("https://demoqa.com/BookStore/v1/Books");
//        response.prettyPrint();

        JsonPath jsonPath = response.jsonPath();

        List<Map<String,Object>> books = jsonPath.getList("books");

        System.out.println(books.size());
        System.out.println(books);

        Map<String, Object> book1 = jsonPath.getMap("books[0]");
        System.out.println(book1);
    }






}
