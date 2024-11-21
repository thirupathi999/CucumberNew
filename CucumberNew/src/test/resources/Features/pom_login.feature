Feature: Login functionality from POM
Scenario Outline: POM-Check login with valid creds
Given pom user is on login page
When pom user enters valid "<uname>" and "<password>"
And pom clickss on login button
Then pom userr navigated to home 


Examples:
|uname|password|
|standard_user|secret_sauce|
|locked_out_user|secret_sauce|
|problem_user|secret_sauce|
|performance_glitch_user|secret_sauce|