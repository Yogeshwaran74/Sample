Feature: Rediff Create-Account
   Scenario: create account with giving valid inputs
   Given I navigate to the home page 
   When I click the create-account button
   And enter "<Full Name>" in the Fullname field 
   And enter "<choose a rediffmail>" in the rediffmailid field
   And enter "<password>" in the password field
   And enter "<retype password>" in the retype field
   And enter "<Alternate email>" in the alternate email field
   And enter "<mobile number>" in the mobile number field
   And choose date of birth
   And choose I live  in
   And enter captcha
   And click the create account button
   Then user account should be created successfully
   
   Examples:
   		|Full Name      |choose a rediffmail   |password  |retype password|Alternate email   |mobile number|
   		|Sathish          |sathishs            |Welcome@123|Welcome@123|sathishs2003@gmail.com|9361164003|