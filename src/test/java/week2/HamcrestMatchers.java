package week2;

import org.hamcrest.*;
import org.junit.jupiter.api.*;

import java.util.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class HamcrestMatchers {

    @Test
    public void test1(){

        MatcherAssert.assertThat(5,is(5));

        MatcherAssert.assertThat(5,not(10));

        MatcherAssert.assertThat(5, is(not(9)));

        assertThat(5,equalTo(5));
        assertThat(5,notNullValue());

        assertThat("hello",is("hello"));

        String str1 = "house";
        String str2 = "house";
        assertThat(str1,is(str2));

        String str3 = "ou";
        assertThat(str1,containsString(str3));

        Object obj = "hello";
        assertThat(obj,instanceOf(String.class));

        List<Integer> numbers = Arrays.asList(3,4,5,6);
        assertThat(numbers,everyItem(greaterThan(0)));




    }
}
