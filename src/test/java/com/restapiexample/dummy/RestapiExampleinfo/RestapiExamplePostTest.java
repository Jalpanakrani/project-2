package com.restapiexample.dummy.RestapiExampleinfo;

import com.restapiexample.dummy.model.RestapiExamplePojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static io.restassured.RestAssured.given;

/*
 *  Created by Jalpa Nakrani
 */
public class RestapiExamplePostTest extends TestBase {

    @Test
    public void postCreate() {

        RestapiExamplePojo restapiExamplePojo = new RestapiExamplePojo();
        restapiExamplePojo.setName("test");
        restapiExamplePojo.setSalary("123");
        restapiExamplePojo.setAge("23");
        restapiExamplePojo.setId("25");

       Response response = given()
                .header("Content-Type", "application/json")
                .body(restapiExamplePojo)
                .when()
                .post("/create");
       response.then().statusCode(200);
       response.prettyPrint();

    }
}
