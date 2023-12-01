Feature: This is a login feature for verify the login functionality




Scenario: Verify user can login
Given Open demoblaze application
Then Click login
Then Enter username
Then Enter password
Then Verify user can login

Scenario: Verify user in cart page
Given Open demoblaze application
Then click cart link