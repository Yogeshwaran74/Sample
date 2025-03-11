Feature: Rediff Sign-in 
   Scenario: Login with correct username and correct password
   Given I navigate to the sign-in page 
   When I click the sig-in button
   And enter "<username>" in the username field 
   And enter "<password>" in the password field
   And clicks the signin button 
   Then user should be logged successfully
   
   Examples:
      |username | password|
      |Yogesh    |Yogesh1234|
      |Sathish | Sathish1234|
