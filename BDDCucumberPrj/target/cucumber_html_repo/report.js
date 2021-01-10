$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Test",
  "description": "",
  "id": "login-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Successful Login with valid credentials",
  "description": "",
  "id": "login-test;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters email and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should see logout link",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckLogin.user_is_on_Login_page()"
});
formatter.result({
  "duration": 14035741100,
  "status": "passed"
});
formatter.match({
  "location": "CheckLogin.user_enters_email_and_password()"
});
formatter.result({
  "duration": 3426820300,
  "status": "passed"
});
formatter.match({
  "location": "CheckLogin.user_should_see_logout_link()"
});
formatter.result({
  "duration": 3294953600,
  "status": "passed"
});
});