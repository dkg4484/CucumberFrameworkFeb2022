Feature: Testing Amazon features

@SignIn
Scenario: Test SignIn Scenario
Given the user passes the url "https://www.amazon.in"
When the user clicks the signIn button
Then the user should see the signIn page


@CreateAccount
Scenario: Test createAmazonAccount Scenario

Given the user clicks createAmazon Account
When the user sending the username "Dinesh"
And the user pass mobileNumber "7305343555" Password "Admin123!" and Confirm Password "Admin123!"
And the user clicking the continue button
