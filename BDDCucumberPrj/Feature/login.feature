Feature: Login Test

@smoke
Scenario: Successful Login with valid credentials
Given User is on Login page
When user enters email and password
Then user should see logout link

@regression
Scenario: Test Demowebshop with invalid credentials
Given User is on Signin page
When user enters valid email and invalid password
Then user should see a error message