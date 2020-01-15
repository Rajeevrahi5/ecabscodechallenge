package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.EcabsFileUtility;
import utility.HandleDateTime;

import java.io.IOException;
import java.util.Properties;

public class ExpediaSearchFlight {

    private WebDriver driver;
    private String url = "https://www.expedia.com/";
    private Properties properties = new Properties();
    private EcabsFileUtility ecabsFileUtility = new EcabsFileUtility();

    private String expectedFirstDepartureDate = HandleDateTime.getDepartureDate(1);
    private String expectedSecondDepartureDate = HandleDateTime.getDepartureDate(4);
    private String expectedThirdDepartureDate = HandleDateTime.getDepartureDate(8);

    Logger log = Logger.getLogger(ExpediaSearchFlight.class);

    public ExpediaSearchFlight(){
        driver = Hook.getDriver();
        try {
            properties.load(ecabsFileUtility.getFileFromResources("testData/expediaSearchFlightTestData.properties"));
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    @Given("^user launch expedia URL$")
    public void user_launch_expedia_URL(){
        //Maximizing the web-browser
        try {
            driver.manage().window().maximize();
            driver.get(url);
            log.info("\nURL: "+url+" is launched.\n\n");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @When("^User clicks on Flight option$")
    public void clickOnFlightsOptionFromMenu() throws InterruptedException {
        driver.findElement(By.cssSelector("#tab-flight-tab-hp")).click();
        Thread.sleep(2000);
        log.info("\nFlight option from menu is clicked.\n\n");
    }
    @When("^User clicks on multi city option$")
    public void clickMultiCity() throws InterruptedException {
        driver.findElement(By.cssSelector("#flight-type-multi-dest-label-hp-flight")).click();
        Thread.sleep(2000);
        log.info("\nMulti city travel option is selected.\n\n");
    }

    @When("^Enter first Departure city$")
    public void enter_first_Departure_city() throws InterruptedException {
        driver.findElement(By.cssSelector("#flight-origin-hp-flight")).sendKeys(properties.getProperty("expectedFirstDepartureCity"));
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#aria-option-0 > div.multiLineDisplay.details")).click();
        log.info("\nFirst Departure City is entered.\n\n");
    }

    @When("^Enter first Arrival city$")
    public void enter_first_Arrival_city() throws InterruptedException {
        driver.findElement(By.cssSelector("#flight-destination-hp-flight")).sendKeys(properties.getProperty("expectedFirstArrivalCity"));
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#aria-option-0 > div.multiLineDisplay.details")).click();
        Thread.sleep(2000);
        log.info("\nFirst Arrival City is entered.\n\n");
    }

    @When("^Enter first Departure date$")
    public void enter_first_Departure_date() {
        try {
            driver.findElement(By.cssSelector("#flight-departing-single-hp-flight")).click();
            driver.findElement(By.cssSelector("#flight-departing-single-hp-flight")).sendKeys(expectedFirstDepartureDate);
            log.info("\nFirst Departure Date is entered\n\n");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @When("^Select number of travellers$")
    public void select_number_of_travellers() {
        driver.findElement(By.cssSelector("#traveler-selector-hp-flight")).click();
        for(int i = 0; i<3;i++){
            driver.findElement(By.cssSelector("#traveler-selector-hp-flight > div > ul > li > div > div > div > div.uitk-grid.step-input-outside.gcw-component.gcw-component-step-input.gcw-step-input.gcw-component-initialized > div:nth-child(4) > button")).click();
        }
        try {
            driver.findElement(By.cssSelector("#traveler-selector-hp-flight > div > ul > li > div > footer > div > div:nth-child(2) > button")).click();
            log.info("\nTotal number of travellers is selected.\n\n");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @When("^Enter second Departure city$")
    public void enter_second_Departure_city() throws InterruptedException {
        driver.findElement(By.cssSelector("#flight-2-origin-hp-flight")).sendKeys(properties.getProperty("expectedFirstArrivalCity"));
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#aria-option-0 > div.multiLineDisplay.details")).click();
        Thread.sleep(2000);
        log.info("\nSecond Departure City is entered.\n\n");
    }

    @When("^Enter second Arrival city$")
    public void enter_second_Arrival_city() throws InterruptedException {
        driver.findElement(By.cssSelector("#flight-2-destination-hp-flight")).sendKeys(properties.getProperty("expectedSecondArrivalCity"));
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#aria-option-0 > div.multiLineDisplay.details")).click();
        Thread.sleep(2000);
        log.info("\nSecond Arrival City is entered.\n\n");
    }

    @When("^Enter second Departure date$")
    public void enter_second_Departure_date() {
        try {
            driver.findElement(By.cssSelector("#flight-2-departing-hp-flight")).click();
            driver.findElement(By.cssSelector("#flight-2-departing-hp-flight")).sendKeys(expectedSecondDepartureDate);
            log.info("\nSecond Arrival Date is entered.\n\n");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @When("^Click on Add another flight button$")
    public void click_on_Add_another_flight_button() throws InterruptedException {
        driver.findElement(By.cssSelector("#add-flight-leg-hp-flight")).click();
        Thread.sleep(2000);
        log.info("\nClicked on Add another flight button.\n\n");
    }

    @When("^Enter third Departure city$")
    public void enter_third_Departure_city() throws InterruptedException {
        driver.findElement(By.cssSelector("#flight-3-origin-hp-flight")).sendKeys(properties.getProperty("expectedSecondArrivalCity"));
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#aria-option-0 > div.multiLineDisplay.details")).click();
        Thread.sleep(2000);
        log.info("\nThird Departure City is entered.\n\n");
    }

    @When("^Enter third Arrival city$")
    public void enter_third_Arrival_city() throws InterruptedException {
        driver.findElement(By.cssSelector("#flight-3-destination-hp-flight")).sendKeys(properties.getProperty("expectedFirstDepartureCity"));
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#aria-option-0 > div.multiLineDisplay.details")).click();
        Thread.sleep(2000);
        log.info("\nThird Arrival City is entered.\n\n");
    }

    @When("^Enter third Departure date$")
    public void enter_third_Departure_date() {
        try {
            driver.findElement(By.cssSelector("#flight-3-departing-hp-flight")).click();
            driver.findElement(By.cssSelector("#flight-3-departing-hp-flight")).sendKeys(expectedThirdDepartureDate);
            log.info("\nThird Departure Date is entered.\n\n");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Then("^Click on Search button$")
    public void click_on_Search_button() throws InterruptedException {
        driver.findElement(By.cssSelector("#gcw-flights-form-hp-flight > div.cols-nested.ab25184-submit > label > button")).click();
        Thread.sleep(5000);
        log.info("\nClick on Search Button.\n\n");
    }

    @Then("^Verify first Departure city$")
    public void verify_first_Departure_city(){
        try {
            String actualFirstDepartureCity = driver.findElement(By.cssSelector("#departure-airport-1")).getAttribute("value");
            Assert.assertEquals(properties.getProperty("expectedFirstDepartureCity"), actualFirstDepartureCity);
            log.info("\nFirst Departure City is verified.\n\n");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Then("^Verify first Arrival city$")
    public void verify_first_Arrival_city() {
        try {
            String actualFirstArrivalCity = driver.findElement(By.cssSelector("#arrival-airport-1")).getAttribute("value");
            Assert.assertEquals(properties.getProperty("expectedFirstArrivalCity"), actualFirstArrivalCity);
            log.info("\nFirst Arrival City is verified.\n\n");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Then("^Verify first Departure date$")
    public void verify_first_Departure_date() {
        try {
            String actualFirstDepartureDate = driver.findElement(By.cssSelector("#departure-date-1")).getAttribute("value");
            Assert.assertEquals(expectedFirstDepartureDate, actualFirstDepartureDate);
            log.info("\nFirst Departure Date is verified.\n\n");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Then("^Verify number of travellers$")
    public void verify_number_of_travellers() {
        try {
            String actualNumberOfTravellers = driver.findElement(By.cssSelector("#advanced-options-container > fieldset")).getText();
            Assert.assertEquals(properties.getProperty("expectedNumberOfTravellers"), actualNumberOfTravellers.substring(0, 1));
            log.info("\nNumber of travellers is verified.\n\n");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Then("^Verify second Departure city$")
    public void verify_second_Departure_city() {
        try {
            String actualSecondDepartureCity = driver.findElement(By.cssSelector("#departure-airport-2")).getAttribute("value");
            Assert.assertEquals(properties.getProperty("expectedFirstArrivalCity"), actualSecondDepartureCity);
            log.info("\nFirst Departure City is verified.\n\n");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Then("^Verify second Arrival city$")
    public void verify_second_Arrival_city() {
        try {
            String actualSecondArrivalCity = driver.findElement(By.cssSelector("#arrival-airport-2")).getAttribute("value");
            Assert.assertEquals(properties.getProperty("expectedSecondArrivalCity"), actualSecondArrivalCity);
            log.info("\nSecond Arrival City is verified.\n\n");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Then("^Verify second Departure date$")
    public void verify_second_Departure_date() {
        try {
            String actualSecondDepartureDate = driver.findElement(By.cssSelector("#departure-date-2")).getAttribute("value");
            Assert.assertEquals(expectedSecondDepartureDate, actualSecondDepartureDate);
            log.info("\nSecond Departure City is verified.\n\n");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Then("^Verify third Departure city$")
    public void verify_third_Departure_city() {
        try {
            String actualThirdDepartureCity = driver.findElement(By.cssSelector("#departure-airport-3")).getAttribute("value");
            Assert.assertEquals(properties.getProperty("expectedSecondArrivalCity"), actualThirdDepartureCity);
            log.info("\nThird Departure City is verified.\n\n");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Then("^Verify third Arrival city$")
    public void verify_third_Arrival_city() {
        try {
            String actualThirdArrivalCity = driver.findElement(By.cssSelector("#arrival-airport-3")).getAttribute("value");
            Assert.assertEquals(properties.getProperty("expectedFirstDepartureCity"), actualThirdArrivalCity);
            log.info("\nThird Arrival City is Verified.\n\n");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Then("^Verify third Departure date$")
    public void verify_third_Departure_date() {
        try {
            String actualThirdDepartureDate = driver.findElement(By.cssSelector("#departure-date-3")).getAttribute("value");
            Assert.assertEquals(expectedThirdDepartureDate, actualThirdDepartureDate);
            log.info("\nThird Departure Date is verified.\n\n");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Then("^Verify individual and total price$")
    public void verify_individual_and_total_price() throws InterruptedException {
        //Click on Details an Bagage fee to get total amount paid
        driver.findElements(By.cssSelector("[class='details-container standard-t-margin secondary-content display-larger-screens-only']")).get(0).click();
        Thread.sleep(2000);

        //Extract price for individual
        String individualPriceMessage = driver.findElements(By.cssSelector("[data-test-id='price-column']")).get(0).getAttribute("data-test-price-per-traveler");
        individualPriceMessage = individualPriceMessage.substring(individualPriceMessage.indexOf("$")+1);
        int individualPrice = Integer.parseInt(individualPriceMessage);

        //Convert total number of travellers to integer
        int totalNoOfTravellers = Integer.parseInt(properties.getProperty("expectedNumberOfTravellers"));

        //Calculate expected total amount
        int expectedTotalAmount = individualPrice * totalNoOfTravellers;

        //Read actual total amount
        String totalPriceMessage  = driver.findElement(By.cssSelector("[data-test-id='total-price-message']")).getText();
        int actualTotalAmount =(int)Double.parseDouble(totalPriceMessage.substring(totalPriceMessage.lastIndexOf("$")+1).replace(",",""));

        //Verify prices are correct
        Assert.assertTrue(expectedTotalAmount >= actualTotalAmount);
        log.info("\nIndividual Price and Total Price is Verified.\n\n");
    }



}
