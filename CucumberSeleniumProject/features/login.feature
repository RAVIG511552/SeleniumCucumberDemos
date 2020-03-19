Feature: Test login for demo webshop

Scenario: Test demo webshop with valid credentials
Given Open chrome and start the application
When I provide valid username and password
Then user should be able to login
