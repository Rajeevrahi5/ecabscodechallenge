package service;

import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import modal.EcabsUsers;
import utility.EcabsFileUtility;

import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;

import static io.restassured.RestAssured.given;

public class EcabsService {

    private final EcabsFileUtility fileUtility= new EcabsFileUtility();
    private final Properties props = new Properties();
    private static String ROOT_URL;
    final static Logger logger = Logger.getLogger(EcabsService.class);


   public Response getUsers(){

       Response response = given()
               .accept(ContentType.JSON)
               .contentType(ContentType.JSON)
               .when()
               .log()
               .ifValidationFails()
               .get(ROOT_URL+"users")
               .then()
               .extract()
               .response()
               ;
       //response.then().log().ifError().assertThat().statusCode(200);
       //System.out.println("Response Code  "+ response.statusCode() +  " body : "+response.getBody().prettyPrint());
       //assertThat(response.asString(),matchesJsonSchemaInClasspath("schemas/GetUserList.json"));
       return response;

   }


    public Response registerUser(EcabsUsers ecabsUser){

        Response response = given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(convertToJSON(ecabsUser))
                .when()
                .log()
                .ifValidationFails()
                .post(ROOT_URL+"register")
                .then()
                .extract()
                .response()
                ;
        //response.then().log().ifError().assertThat().statusCode(200);
        //System.out.println("Response Code  "+ response.statusCode() +  " body : "+response.getBody().prettyPrint());
        //assertThat(response.asString(),matchesJsonSchemaInClasspath("schemas/RegisterUserSuccessful.json"));
        return response;

    }

    public String getRootUrl() throws IOException {
            props.load(fileUtility.getFileFromResources("commons.properties"));
            ROOT_URL=props.getProperty("ecabs.url");
            return ROOT_URL;
    }

    public String convertToJSON(EcabsUsers ecabsUser){
        Gson gson = new Gson();
        return gson.toJson(ecabsUser);
    }

}
