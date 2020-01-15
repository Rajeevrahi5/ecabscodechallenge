package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import modal.EcabsUsers;
import org.apache.log4j.Logger;
import service.EcabsService;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.MatcherAssert.assertThat;

public class API_RESTAssuredTestSteps {
    EcabsService ecabsService = new EcabsService();
    EcabsUsers ecabsUser = new EcabsUsers();
    Response response;
    Logger logger = Logger.getLogger(API_RESTAssuredTestSteps.class);

    @When("^user hits the Root URL$")
    public void hitRootURL() {
        try{
            ecabsService.getRootUrl();
            logger.info("\nExtract the root URL\n\n");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    @Then("^User is listed and Status code and body content is verified$")
    public void getUserListAndVerifyStatusAndContent() {
        try{
            response = ecabsService.getUsers();
            response.then().log().ifError().assertThat().statusCode(200);
            assertThat(response.asString(),matchesJsonSchemaInClasspath("schemas/GetUserList.json"));
            logger.info("\nGet User List By API- Status Code 200 and Content is verified.\n\n");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @Then("^User is registered and Status code and body content is verified$")
    public void registerUserAndVerifyStatusAndContent() {
        try{
            ecabsUser.setEmail("eve.holt@reqres.in");
            ecabsUser.setPassword("pistol");
            response = ecabsService.registerUser(ecabsUser);
            response.then().log().ifError().assertThat().statusCode(200);
            assertThat(response.asString(),matchesJsonSchemaInClasspath("schemas/RegisterUserSuccessful.json"));
            logger.info("\nSuccessful Registration: Status Code 200 and Content is Verified.\n\n");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @Then("^Registration is failed and Status code and body content is verified$")
    public void registrationFailedAndVerifyStatusAndContent() {
        try{
            ecabsUser.setEmail("sydney@fife");
            response = ecabsService.registerUser(ecabsUser);
            response.then().log().ifError().assertThat().statusCode(400);
            assertThat(response.asString(),matchesJsonSchemaInClasspath("schemas/RegisterUserFailed.json"));
            logger.info("\nFailed Registration: Status Code 400 and Content is Verified.\n\n");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }


}
