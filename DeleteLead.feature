Feature: Delete Lead for leaf taps

Scenario Outline: TC_003 Delete lead using phone number


When Click on Find Leads for Delete lead
And Click on phone Number tab for Delete lead
Then Enter Phone Number as <phoneNum> for Delete lead
And Click on Find Leads button for Delete lead
Then Click on Lead Record for Delete lead
And Click on Delete Lead button
Then Verify if Lead is deleted

Examples:
|phoneNum|
|'99'|