$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("APITest.feature");
formatter.feature({
  "line": 1,
  "name": "API Automation With REST Assured",
  "description": "",
  "id": "api-automation-with-rest-assured",
  "keyword": "Feature"
});
formatter.before({
  "duration": 40675778,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "API Test - Get User List",
  "description": "",
  "id": "api-automation-with-rest-assured;api-test---get-user-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user hits the Root URL",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User is listed and Status code and body content is verified",
  "keyword": "Then "
});
formatter.match({
  "location": "API_RESTAssuredTestSteps.hitRootURL()"
});
formatter.result({
  "duration": 54636590,
  "status": "passed"
});
formatter.match({
  "location": "API_RESTAssuredTestSteps.getUserListAndVerifyStatusAndContent()"
});
formatter.result({
  "duration": 1231132097,
  "status": "passed"
});
formatter.after({
  "duration": 238222,
  "status": "passed"
});
formatter.before({
  "duration": 330431,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "API Test - Successful Registration with valid credentials",
  "description": "",
  "id": "api-automation-with-rest-assured;api-test---successful-registration-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user hits the Root URL",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User is registered and Status code and body content is verified",
  "keyword": "Then "
});
formatter.match({
  "location": "API_RESTAssuredTestSteps.hitRootURL()"
});
formatter.result({
  "duration": 407691,
  "status": "passed"
});
formatter.match({
  "location": "API_RESTAssuredTestSteps.registerUserAndVerifyStatusAndContent()"
});
formatter.result({
  "duration": 355813887,
  "status": "passed"
});
formatter.after({
  "duration": 238277,
  "status": "passed"
});
formatter.before({
  "duration": 198046,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "API Test - UnSuccessful Registration with email",
  "description": "",
  "id": "api-automation-with-rest-assured;api-test---unsuccessful-registration-with-email",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "user hits the Root URL",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Registration is failed and Status code and body content is verified",
  "keyword": "Then "
});
formatter.match({
  "location": "API_RESTAssuredTestSteps.hitRootURL()"
});
formatter.result({
  "duration": 511124,
  "status": "passed"
});
formatter.match({
  "location": "API_RESTAssuredTestSteps.registrationFailedAndVerifyStatusAndContent()"
});
formatter.result({
  "duration": 324929044,
  "status": "passed"
});
formatter.after({
  "duration": 250897,
  "status": "passed"
});
formatter.uri("APSignIn.feature");
formatter.feature({
  "line": 1,
  "name": "Automation Practice SignIn",
  "description": "",
  "id": "automation-practice-signin",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1269753311,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Sign in with no credentials",
  "description": "",
  "id": "automation-practice-signin;sign-in-with-no-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user enters the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on SignIn button at home page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks on SignIn button at account page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "error message related to Email is thrown",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationPracticeSignInSteps.hitURL()"
});
formatter.result({
  "duration": 5217129674,
  "status": "passed"
});
formatter.match({
  "location": "AutomationPracticeSignInSteps.clickSignInButtonAtHomePage()"
});
formatter.result({
  "duration": 7892769655,
  "status": "passed"
});
formatter.match({
  "location": "AutomationPracticeSignInSteps.clickSignInButtonAtAccountPage()"
});
formatter.result({
  "duration": 4955177866,
  "status": "passed"
});
formatter.match({
  "location": "AutomationPracticeSignInSteps.verifiyEmailErrorMessage()"
});
formatter.result({
  "duration": 29646124,
  "status": "passed"
});
formatter.after({
  "duration": 95363326,
  "status": "passed"
});
formatter.before({
  "duration": 832347872,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Sign in with email and empty password",
  "description": "",
  "id": "automation-practice-signin;sign-in-with-email-and-empty-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "user enters the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user clicks on SignIn button at home page",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user enters Email ID",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user clicks on SignIn button at account page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "error message related to password is thrown",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationPracticeSignInSteps.hitURL()"
});
formatter.result({
  "duration": 3797854384,
  "status": "passed"
});
formatter.match({
  "location": "AutomationPracticeSignInSteps.clickSignInButtonAtHomePage()"
});
formatter.result({
  "duration": 4027341615,
  "status": "passed"
});
formatter.match({
  "location": "AutomationPracticeSignInSteps.entersEmailID()"
});
formatter.result({
  "duration": 161160252,
  "status": "passed"
});
formatter.match({
  "location": "AutomationPracticeSignInSteps.clickSignInButtonAtAccountPage()"
});
formatter.result({
  "duration": 3907320391,
  "status": "passed"
});
formatter.match({
  "location": "AutomationPracticeSignInSteps.verifyPasswordErrorMessage()"
});
formatter.result({
  "duration": 27190578,
  "status": "passed"
});
formatter.after({
  "duration": 94764217,
  "status": "passed"
});
formatter.before({
  "duration": 796366032,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Sign in with password and empty email",
  "description": "",
  "id": "automation-practice-signin;sign-in-with-password-and-empty-email",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "user enters the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user clicks on SignIn button at home page",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user enters Password",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user clicks on SignIn button at account page",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "error message related to Email is thrown",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationPracticeSignInSteps.hitURL()"
});
formatter.result({
  "duration": 3366283786,
  "status": "passed"
});
formatter.match({
  "location": "AutomationPracticeSignInSteps.clickSignInButtonAtHomePage()"
});
formatter.result({
  "duration": 5043565994,
  "status": "passed"
});
formatter.match({
  "location": "AutomationPracticeSignInSteps.user_enters_Password()"
});
formatter.result({
  "duration": 125025166,
  "status": "passed"
});
formatter.match({
  "location": "AutomationPracticeSignInSteps.clickSignInButtonAtAccountPage()"
});
formatter.result({
  "duration": 3674602151,
  "status": "passed"
});
formatter.match({
  "location": "AutomationPracticeSignInSteps.verifiyEmailErrorMessage()"
});
formatter.result({
  "duration": 26600591,
  "status": "passed"
});
formatter.after({
  "duration": 91375558,
  "status": "passed"
});
formatter.before({
  "duration": 816044639,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Sign in with incorrect credentials",
  "description": "",
  "id": "automation-practice-signin;sign-in-with-incorrect-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "user enters the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "user clicks on SignIn button at home page",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "user enters Email ID",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user enters Password",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user clicks on SignIn button at account page",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Authentication fail error is thrown",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationPracticeSignInSteps.hitURL()"
});
formatter.result({
  "duration": 3311975559,
  "status": "passed"
});
formatter.match({
  "location": "AutomationPracticeSignInSteps.clickSignInButtonAtHomePage()"
});
formatter.result({
  "duration": 3996727981,
  "status": "passed"
});
formatter.match({
  "location": "AutomationPracticeSignInSteps.entersEmailID()"
});
formatter.result({
  "duration": 163045177,
  "status": "passed"
});
formatter.match({
  "location": "AutomationPracticeSignInSteps.user_enters_Password()"
});
formatter.result({
  "duration": 60470810,
  "status": "passed"
});
formatter.match({
  "location": "AutomationPracticeSignInSteps.clickSignInButtonAtAccountPage()"
});
formatter.result({
  "duration": 3945255066,
  "status": "passed"
});
formatter.match({
  "location": "AutomationPracticeSignInSteps.verifyAuthenticationFailMessage()"
});
formatter.result({
  "duration": 26624918,
  "status": "passed"
});
formatter.after({
  "duration": 92495812,
  "status": "passed"
});
formatter.uri("ECSearch.feature");
formatter.feature({
  "line": 1,
  "name": "Expedia Flight Search",
  "description": "",
  "id": "expedia-flight-search",
  "keyword": "Feature"
});
formatter.before({
  "duration": 843640265,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Browser is set up and URL is launched",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user launch expedia URL",
  "keyword": "Given "
});
formatter.match({
  "location": "ExpediaSearchFlight.user_launch_expedia_URL()"
});
formatter.result({
  "duration": 4286718159,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Search multi city flight and verify the price",
  "description": "",
  "id": "expedia-flight-search;search-multi-city-flight-and-verify-the-price",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User clicks on Flight option",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User clicks on multi city option",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter first Departure city",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Enter first Arrival city",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Enter first Departure date",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Select number of travellers",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Enter second Departure city",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Enter second Arrival city",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Enter second Departure date",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Click on Add another flight button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Enter third Departure city",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Enter third Arrival city",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Enter third Departure date",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Click on Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Verify first Departure city",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Verify first Arrival city",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Verify first Departure date",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Verify number of travellers",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Verify second Departure city",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Verify second Arrival city",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Verify second Departure date",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Verify third Departure city",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Verify third Arrival city",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Verify third Departure date",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Verify individual and total price",
  "keyword": "And "
});
formatter.match({
  "location": "ExpediaSearchFlight.clickOnFlightsOptionFromMenu()"
});
formatter.result({
  "duration": 2195652142,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSearchFlight.clickMultiCity()"
});
formatter.result({
  "duration": 2104996017,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSearchFlight.enter_first_Departure_city()"
});
formatter.result({
  "duration": 2679376928,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSearchFlight.enter_first_Arrival_city()"
});
formatter.result({
  "duration": 4672953866,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSearchFlight.enter_first_Departure_date()"
});
formatter.result({
  "duration": 189469851,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSearchFlight.select_number_of_travellers()"
});
formatter.result({
  "duration": 480230811,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSearchFlight.enter_second_Departure_city()"
});
formatter.result({
  "duration": 4578170470,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSearchFlight.enter_second_Arrival_city()"
});
formatter.result({
  "duration": 4445529676,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSearchFlight.enter_second_Departure_date()"
});
formatter.result({
  "duration": 212299479,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSearchFlight.click_on_Add_another_flight_button()"
});
formatter.result({
  "duration": 2146414415,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSearchFlight.enter_third_Departure_city()"
});
formatter.result({
  "duration": 4409759381,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSearchFlight.enter_third_Arrival_city()"
});
formatter.result({
  "duration": 4511297945,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSearchFlight.enter_third_Departure_date()"
});
formatter.result({
  "duration": 218433875,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSearchFlight.click_on_Search_button()"
});
formatter.result({
  "duration": 7608568076,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSearchFlight.verify_first_Departure_city()"
});
formatter.result({
  "duration": 29198631,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSearchFlight.verify_first_Arrival_city()"
});
formatter.result({
  "duration": 14736829,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSearchFlight.verify_first_Departure_date()"
});
formatter.result({
  "duration": 13913356,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSearchFlight.verify_number_of_travellers()"
});
formatter.result({
  "duration": 23988487,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSearchFlight.verify_second_Departure_city()"
});
formatter.result({
  "duration": 14784167,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSearchFlight.verify_second_Arrival_city()"
});
formatter.result({
  "duration": 15106770,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSearchFlight.verify_second_Departure_date()"
});
formatter.result({
  "duration": 13816606,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSearchFlight.verify_third_Departure_city()"
});
formatter.result({
  "duration": 13816652,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSearchFlight.verify_third_Arrival_city()"
});
formatter.result({
  "duration": 13629685,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSearchFlight.verify_third_Departure_date()"
});
formatter.result({
  "duration": 14302181,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSearchFlight.verify_individual_and_total_price()"
});
formatter.result({
  "duration": 2148454070,
  "status": "passed"
});
formatter.after({
  "duration": 182388891,
  "status": "passed"
});
});