Feature: Login into Application

Scenario Outline: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "http://qaclickacademy.com" Site
And Click on login link in home page to land on Secure sign in Page
When User enters <username> and <password> and log in
Then Verify that user is successfully logged in
And Close browsers


Examples:
|username            |password    |
|test123@gmail.com   |123456      |
|test99@gmail.com    |1234        |