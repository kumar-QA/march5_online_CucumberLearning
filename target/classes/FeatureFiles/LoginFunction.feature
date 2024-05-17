Feature: Verify loginFunction completely

Scenario: verify login function with valid Data
Given openBrowser and Enter url
When user enter valid username
And User enter valid password
When user click on loginButton
Then it should naviaget to Successfullypage


Scenario: verify loginfunction with invalid data
 Given openBrowser and Enter url
 When User enter invalid username
 When user enter invlaid password
 When user click on loginButton
 Then it should display error message


Scenario: verify loginFunction with valid username and Invalid password
Given openBrowser and Enter url 
When user enter valid username
And user enter invlaid password
When user click on loginButton
Then it should display as invalid password


Scenario: verify loginFunction with Invalid username and valid password
Given openBrowser and Enter url 
When user enter Invalid username
And user enter valid password
When user click on login button
Then it should display as invalid username

Scenario: Verify loginfunction without username and password
Given openBrowser and Enter url 
When user click on loginButton Without credentials
Then it should display error message Enter username and password
#




