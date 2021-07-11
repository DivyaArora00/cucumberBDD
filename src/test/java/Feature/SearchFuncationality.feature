Feature: product searching on nop Commerce website

  Scenario Outline: Verify search functionality with different search data

    Given : i navigate to url "https://demo.nopcommerce.com/"
    Then :  i should be navigated to homepage.
    When : I enter text in search box as "<data>"
    And : i click on search button
    Then Related products shall be seen

    Examples:
      | data    |
      | Mac     |
      | Shoes   |
      | laptop  |
