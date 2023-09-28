Feature: F03_currencies | user change currencies to euro and explore products

  Scenario: user inspect on products for euro
    Given  user change to euro from the downlist
    When   user Scroll down the website
    Then   user Assert all products

