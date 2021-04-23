Feature: Create Lead for LeafTaps

Scenario Outline: TC001_createLead with valid data

And Click on Create Lead
And Enter the Company Name as <compName>
And Enter the First Name as <firstName>
And Enter the Last Name as <lastName>
Then Submit button is clicked

Examples:
|compName|firstName|lastName|
|'L&T'|'Moeen'|'Ali'|
|'CSK'|'Abel'|'Morgan'|
