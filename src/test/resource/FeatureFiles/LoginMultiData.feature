
Feature: verify login function with multiple values
  
  Scenario Outline: login with multidata
  Given openBrowser and Enter url
  When user enter <username> value
  And user enter <password> data
  When user click on loginButton
  Then  result should be displayed
  
  Examples:
   |username| password|
   |kumar   | kumar1234|
   |sai     | sai1234  |
   |Student | Password123|

  
