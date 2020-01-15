package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import org.apache.commons.io.FileUtils;
import service.EcabsService;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * Created by Rajeev on 1/12/2020.
 * Email : rajeev.rahi32@gmail.com
 */
public class Hook {
    private static WebDriver webDriver;
    String chromeDriverPath = System.getProperty("user.dir")+"/driver/chromedriver";
    String firefoxDriverPath = System.getProperty("user.dir")+"/driver/geckodriver";
    final static Logger logger = Logger.getLogger(EcabsService.class);


    @Before
    public void beforeScenario(Scenario scenario) {

        // browser name value passed from command line
        String browserName = System.getProperty("browser");

        DesiredCapabilities capability = new DesiredCapabilities();

        //Check if test type is selenium or Rest assured
        if(scenario.getName().contains("API Test")){
            logger.info("\n***************************************************************************************************\n" +
                    "*         "+"Executing REST Scenario: "+scenario.getName() +"                 *\n+" +
                    "***************************************************************************************************\n");
        }

        // if browser name value is not passed from commandline then by default test would run on chrome
        else if (browserName == null) {
            logger.info("\n***************************************************\n+" +
                    "*         "+"Chrome Browser Launched"+"                       *\n+" +
                    "*******************************************************\n");
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            capability.setBrowserName("Chrome");
            webDriver = new ChromeDriver();
        }
        // if browser name passed as firefox
        else if (browserName.equalsIgnoreCase("Firefox")) {
            logger.info("\n***************************************************\n+" +
                    "*         "+"Firefox Browser Launched"+"                       *\n+" +
                    "*******************************************************\n");
            System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
            capability.setBrowserName("Firefox");
            webDriver = new FirefoxDriver();

        }
        // if browser name passed as chrome
        else if (browserName.equalsIgnoreCase("chrome")) {
            logger.info("\n***************************************************\n+" +
                    "*         " + "Chrome  Browser Launched " + "            *\n+" +
                    "*******************************************************\n");
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            capability.setBrowserName("Chrome");
            webDriver = new ChromeDriver();
        }

    }

    @After
    /**
     * method executes at the end of each scenario and takes screenshot in case of scenario failure.
     * Also, quit the webdriver
     *
     * @param scenario to verify if scenarios has passed or failed
     */
    public void afterScenario(Scenario scenario) {

        if(scenario.getName().contains("API Test")){
            logger.info("\n***************************************************************************************************\n" +
                    "*     "+"Exiting REST Scenario: "+scenario.getName()+"            *\n" +
                    "***************************************************************************************************\n");
        }

            // Here will compare if test is failing then only it will enter into if condition

            else if (scenario.isFailed()) {
                try {
                    TakesScreenshot ts = (TakesScreenshot) webDriver;

                    // Call method to capture screenshot
                    File source = ts.getScreenshotAs(OutputType.FILE);

                    //Create screenshot folder, If not created. Save the screenshot of that step  in case of failure
                    FileUtils.copyFile(source, new File(".//src//test//java//outputFiles//" + scenario.getName() +
                            new SimpleDateFormat("MM-dd-yyyy-HH-mm-ss")
                                    .format(new GregorianCalendar().getTime())
                            + ".png"));
                    logger.info("Scenario failed and screenshot saved in outputFiles folder");
                } catch (Exception e) {
                    e.printStackTrace();
                    logger.info("Exception while taking screenshot " + e.getMessage());

                }
            }

        // quitting the webdriver
        if(webDriver!=null) {
            logger.info("\n\nClosing the Browser.");
            webDriver.quit();
        }
    }


    //Getter and setter of webdriver
    public static WebDriver getDriver() {
        return webDriver;
    }

    public void setDriver(WebDriver driver) {
        this.webDriver = driver;
    }
}
