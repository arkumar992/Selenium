Feature: Create Lead functionality
Background: 
Given Launch the Browser
And Maximizi the Browser 
And Load the URL
And Set the TimeOut 
And Enter the userName as DemoSalesManager
And Enter the Password as crmsfa
And Click on Login Button
And Verify the Login Successfully
And Click CRF/SFA
And Click on CreateLead

@Sanity
Scenario Outline:: Postive Create Lead functionality

Given Enter Company Name as <Companyname>
And Enter FirstName as <FirstName>
And Enter LastName as <lastName>
When Click on Create Lead
Then Verify the First Name
And Close the Browser 

Examples:
|Companyname|FirstName|lastName|
|Renault|Rohith|M|
|CPT|Petchi|K|

@Smoke
Scenario Outline:: Nagtive Create Lead functionality

And Enter FirstName as Rohith
And Enter LastName as M
When Click on Create Lead
But Verify Error Message 
And Close the Browser 

Examples:
|Companyname|FirstName|lastName|
||Rohith|M|


