$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Only Registered User can login to the application",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch the Application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPage.LaunchtheApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to register with the application",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPage.LogintoApp()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});