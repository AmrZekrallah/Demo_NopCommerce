Feature: User search for product by name then by sku

  Scenario Outline:user could search using product name

    Given user search for product by name "<productname>"
    When user click on search button
    Then url contain "https://demo.nopcommerce.com/search?q=" search show the relevant result
    Examples:
      |productname|
      | Nike|
      | Adidas|
      | Samsung|

  Scenario Outline:user could search using sku

    Given user search for product with sku "<SKU>"
    When user click on search button
    And user click on product using "<SKU>"
    Then sku in product page used with the same sku in search bar "<SKU>"
    Examples:
      |SKU|
      |SF_PRO_11|
      |APPLE_CAM|
      |SCI_FAITH|
