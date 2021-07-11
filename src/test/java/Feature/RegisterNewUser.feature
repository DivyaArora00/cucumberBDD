Feature: Register a new user

  Scenario: Verify New User Registration by enetring data in all mandatory fields

    Given : i navigate to url "https://demo.nopcommerce.com/"
    Then :  i should be navigated to homepage.
    When : i click on register link from navbar
    Then :  i should be navigated to registration page.
    When : i select gender as female
    And : i select day as "4".
    And : i select month as "6"
    And  : i select year as 7.
    And : i enter First Name, Last Name, email, Password, Confirm Password
  |First Name  | Last Name |      email       |  Password  |  Confirm Password |
  |   user1     | test      | user1@gmail.com  | test123    | test123          |
     And : i click on register button
    Then : i should be registered successfully.