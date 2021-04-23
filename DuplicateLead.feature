Feature: Duplicate Lead using leaftaps application

Scenario Outline: TC_004 Create a duplicate lead

Then Click on Find Leads for Duplicate Lead
Then Click on phone Number tab for Duplicate Lead
And Enter Phone Number as <phoneNum> for Duplicate Lead
And Click on Find Leads button for Duplicate Lead
Then Click on Lead Record to create a Duplicate Lead
Given Click on Duplicate Lead
And Click on createLead button

Examples:
|phoneNum|
|'99'|