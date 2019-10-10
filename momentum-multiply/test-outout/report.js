$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("multiply.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: BoMaseko"
    }
  ],
  "line": 3,
  "name": "Momentum Multiply",
  "description": "",
  "id": "momentum-multiply",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Validate Momentum Multiply Home Page",
  "description": "",
  "id": "momentum-multiply;validate-momentum-multiply-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user is on login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user log on multiply home page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 21040533269,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_login_Page()"
});
formatter.result({
  "duration": 128077436,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_log_on_multiply_home_page()"
});
formatter.result({
  "duration": 7382584556,
  "status": "passed"
});
});