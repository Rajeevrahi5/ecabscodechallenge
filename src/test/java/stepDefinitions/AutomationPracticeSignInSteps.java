package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.EcabsFileUtility;

import java.io.IOException;
import java.util.Properties;

public class AutomationPracticeSignInSteps {
    private WebDriver driver;
    private String url = "http://automationpractice.com/index.php";
    Properties properties = new Properties();
    EcabsFileUtility fileUtility = new EcabsFileUtility();
    Logger logger = Logger.getLogger(AutomationPracticeSignInSteps.class);

    public AutomationPracticeSignInSteps(){
        try {
            driver= Hook.getDriver();
            properties.load(fileUtility.getFileFromResources("testData/AutomationPracticeTestData.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    //Background: Browser is set up and URL is launched
    @Given("user enters the URL")
    public void hitURL() {
        try {
            //Maximizing the web-browser
            driver.manage().window().maximize();
            driver.get(url);
            logger.info("\nURL: "+ url + " is launched.\n\n");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    //Scenario 1: Sign in with no credentials
    @When("user clicks on SignIn button at home page")
    public void clickSignInButtonAtHomePage() throws InterruptedException {
        driver.findElement(By.cssSelector("[class='login']")).click();
        Thread.sleep(3000);
        logger.info("\nSign In Button on Home page is Clicked.\n\n");
    }

    @When("user clicks on SignIn button at account page")
    public void clickSignInButtonAtAccountPage() throws InterruptedException {
        driver.findElement(By.cssSelector("[id='SubmitLogin']")).click();
        Thread.sleep(3000);
        logger.info("\nSign In Button at account page is Clicked.\n\n");
    }

    @Then("error message related to Email is thrown")
    public void verifiyEmailErrorMessage() {
        try {
            String actualErrorMessage = driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger")).getText();
            Assert.assertEquals(properties.getProperty("emailErrorMessage"), actualErrorMessage);
            logger.info("\nEmail Error Message is verified.\n\n");
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    //Scenario 2: Sign in with email and empty password
    @When("user enters Email ID")
    public void entersEmailID() {
        try {
            driver.findElement(By.cssSelector("[id='email']")).sendKeys(properties.getProperty("emailID"));
            logger.info("\nEmail ID"+ " is entered.\n\n");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Then("error message related to password is thrown")
    public void verifyPasswordErrorMessage() {
        try {
            String actualErrorMessage = driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger")).getText();
            Assert.assertEquals(properties.getProperty("passwordErrorMessage"), actualErrorMessage);
            logger.info("\nError Message of password is verified\n\n");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //Scenario 3: Sign in with password and empty email
    @When("user enters Password")
    public void user_enters_Password() {
        try {
            driver.findElement(By.cssSelector("[id='passwd']")).sendKeys(properties.getProperty("password"));
            logger.info("\nEmail ID is entered.\n\n");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //Scenario 4: Sign in with incorrect credentials
    @Then("Authentication fail error is thrown")
    public void verifyAuthenticationFailMessage() {
        try {
            String actualErrorMessage = driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger")).getText();
            Assert.assertEquals(properties.getProperty("authenticationErrorMessage"), actualErrorMessage);
            logger.info("\nAuthentication Error Message is verified\n\n");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
