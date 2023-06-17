$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("virgingame.feature");
formatter.feature({
  "line": 2,
  "name": "Test  navigation functionality for virgingames website",
  "description": "As an user I want to navigate into virgingames website",
  "id": "test--navigation-functionality-for-virgingames-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7672812900,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should navigate to login page successfully",
  "description": "",
  "id": "test--navigation-functionality-for-virgingames-website;user-should-navigate-to-login-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on the  homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I accept cookie on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on \"Login\" link",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should navigate to verify page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.iAmOnTheHomepage()"
});
formatter.result({
  "duration": 153778200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iAcceptCookieOnHomepage()"
});
formatter.result({
  "duration": 280189700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 12
    }
  ],
  "location": "HomePageSteps.iClickOnLink(String)"
});
formatter.result({
  "duration": 463799400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldNavigateToVerifyPageSuccessfully()"
});
formatter.result({
  "duration": 60484300,
  "status": "passed"
});
formatter.after({
  "duration": 757170600,
  "status": "passed"
});
});