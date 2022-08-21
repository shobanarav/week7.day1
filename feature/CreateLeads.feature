Feature: Login to the Leaftaps Application and CreateLead

Background: Positive Login
Given Type the username as 'Demosalesmanager'
And Type the password as 'crmsfa'
When Click on the Login button

Scenario Outline: Create leads with diferrent data
Given Click CRMSFA Link
And Click Leads Tab
And Click Create Leads Link
When Type the company name as <companyName>
And Type the first name as <firstName>
And Type the last name as <lastName>
And Click Create Leads Button
Then Verify the View Leads Page

Examples:
|companyName|firstName|lastName|
|TestLeaf|Karthik|Iyer|
|Infosys|Shobana|Ravi|
