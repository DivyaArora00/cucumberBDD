Feature: Forgot your Password
  Scenario: Verify forgot your password link
    Given i navigate to url "https://demo.nopcommerce.com/"
    Then :  i should be navigated to homepage.
    When I click on Login link
    Then Login page shall open
    When i click on Forgot password? link
    Then I am navigated to password recovery page
    When I enter email as "abc@gmail.com"
    And i click on Recover Button
    Then "Email with instructions has been sent to you" message shall be displayed
