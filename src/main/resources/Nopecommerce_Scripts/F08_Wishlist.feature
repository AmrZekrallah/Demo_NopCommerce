Feature: User can add products to his wishlist

  Scenario:user make sure that product added successfully
    Given user pick one of the product to his wishlist
    Then user can see the product added to his wishlist

  Scenario:user can add product on his wishlist and show the Qty on his Cart
    Given user pick one of the product to his wishlist
    When user click on wishlist
    Then user can show product added to his wishlist and the Qty value increase