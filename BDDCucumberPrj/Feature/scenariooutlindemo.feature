Feature: Check login with multiple data

Scenario Outline: Successful signin with valid entries

Given User is demowebshop login page
When user logs in with <email> and <password>
Then user should view the logout link

Examples: 
|email              |password|
|rekhabr1@gmail.com |rekhab  |
|rekhabr3@gmail.com |rekhab  |