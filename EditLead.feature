Feature: Edit Leads information

Scenario Outline: TC002_Edit lead details


And Click on Find Leads
And Click on phone Number tab
And Enter Phone Number as <phoneNum>
And Click on Find Leads button
Then Click on Lead Record
And Click on Edit button
And Edit CompanyName as <compName>
Then Click on Submit button

Examples:
|phoneNum|compName|
|'99'|'Swiggy'|
|'99'|'paytm'|