Feature: Verify loginFunction completely

Background:
Given openBrowser and Enter url

@postiveTesting
Scenario: verify login function with valid Data
When user enter valid username
And User enter valid password
When user click on loginButton
Then it should naviaget to Successfullypage


@NegativeTesting
Scenario: verify loginfunction with invalid data
 When User enter invalid username
 When user enter invlaid password
 When user click on loginButton
 Then it should display error message
 
#
#@NegativeTesting
#Scenario: verify loginFunction with valid username and Invalid password
#When user enter valid username
#And user enter invlaid password
#When user click on loginButton
#Then it should display as invalid password
#
#@NegativeTesting
#Scenario: verify loginFunction with Invalid username and valid password
#When User enter invalid username
#And User enter valid password
#When user click on loginButton
#Then it should display as invalid username
#
#@dummy
#Scenario: Verify loginfunction without username and password
#When user click on loginButton Without credentials
#Then it should display error message Enter username and password





