Feature: Page Factory Login functionality
@smoke
Scenario: PF Check login with valid creds
Given pF user is on login page
When pF user enters valid "<uname>" and "<password>"
And pF clickss on login button
Then pF userr navigated to home 


Examples:
|uname|password|
|standard_user|secret_sauce|
|locked_out_user|secret_sauce|
