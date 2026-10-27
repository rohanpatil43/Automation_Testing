Feature: Register and login Opencart

Background:
 Given opencart website should be lanuched
 
  Scenario: To verify Register with all deatils
    When Enter username , fristname ,last name 
    And enter gmail ,country ,password
    And click on register button
    Then User should create account and  register successfll with all deatils
	
  Scenario: To verify user should be login with valid credentalis
    When click on landung page login button
    And Eter Email and password
    And click on login button
    Then User should be login with valid credenatails
