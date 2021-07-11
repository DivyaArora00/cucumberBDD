Feature: Add product to cart

  Scenario: Verify user can add product to cart in nop commerce website

    Given : i navigate to url "https://demo.nopcommerce.com/"
    Then :  i should be navigated to homepage.
    When : i click on Books
    Then : Books page shall open.
    When : i click on Add to cart Button below Fahrenheit 451 by Ray Bradbury
    Then : Product is added to cart and confirmation message is displayed
