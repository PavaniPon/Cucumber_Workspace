Feature: Verifying user registration

    Scenario: Valid Registration
    Given Enter Facebook site url
    When User enter valid mobile number
    And Wait for OTP
    And Enter valid OTP
    And Click on create account button 
    Then Verify registration successful message displayed
    
    
      Scenario: 
       Given Enter Facebook site url
       
