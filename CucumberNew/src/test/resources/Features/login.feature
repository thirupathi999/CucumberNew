Feature: Login functionality



Scenario: Check login with entering valid creds manually
Given user is on the login page
When user enters valid uname and password
And clicks on login button
Then user navigated to home page


Scenario: Check login with valid creds with parameterization
Given userr is on login page
When userr enters valid "<uname>" and "<password>"
And clickss on login button
Then userr navigated to home page



Examples:
|uname|password|
|standard_user|secret_sauce|
|locked_out_user|secret_sauce|
|problem_user|secret_sauce|
|performance_glitch_user|secret_sauce|