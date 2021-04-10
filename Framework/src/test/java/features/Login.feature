Feature: Login to netbanking

Scenario: Home page default login
Given User is on landing page
When User login to application with username and password
Then Home page is populated
And Cards are displayed