package testRequest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ApiTest {

    @Test
    public void getCategories() {
        String endpoint = "http://localhost:80/api_testing/product/read.php";
        var response = given().when().get(endpoint).then();
        response.log().body();
    }

    @Test
    public void getProduct() {
        String endpoint = "http://localhost:80/api_testing/product/read_one.php";
        var response = given().queryParam("id", 2).when().get(endpoint).then();
        response.log().body();
    }

//    @Test
//    public void createProduct() {
//        String endpoint = "http://localhost:80/api_testing/product/create.php";
//        String body = """
//                 {
//                      "name": "Water Bottle",
//                      "description": "Dark Water",
//                      "price": 150,
//                      "category_id": 3
//                 }
//                """;
//
//        var response = given().body(body).when().post(endpoint).then();
//        response.log().body();
//    }

    // put -- Request -> https://prnt.sc/faxvK8NRuU68
    // Delete -- Request -> https://prnt.sc/pSyAWjTauzl6
    // Task -- https://prnt.sc/6iyUERyP4_Tp



}
