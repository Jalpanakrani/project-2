package com.restapiexample.dummy.RestapiExampleinfo;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class RestapiExampleDeleteTest extends TestBase {

    @Test
    public void deleteuser(){
        Response response= given()
                .pathParam("id","1")
                .when()
                .delete("delete/{id}");
        response.then().statusCode(200);
        System.out.println("Data is delated");
        response.prettyPrint();
    }

}
