package com.restapiexample.dummy.RestapiExampleinfo;

import com.restapiexample.dummy.model.RestapiExamplePojo;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class RestapiExamplePutTest {

    @Test
    public void updateRestapiExample() {

        RestapiExamplePojo restapiExamplePojo = new RestapiExamplePojo();
        restapiExamplePojo.setEmployee_name("dhyani");
        restapiExamplePojo.setEmployee_salary("50000");
        restapiExamplePojo.setEmployee_age("30");
        restapiExamplePojo.setProfile_image("");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(restapiExamplePojo)
                .pathParam("id","21")
                .when()
                .post("update/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
