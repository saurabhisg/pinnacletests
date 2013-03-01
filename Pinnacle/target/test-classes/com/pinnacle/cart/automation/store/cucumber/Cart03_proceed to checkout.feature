   Feature: This feature is used to test proceed to checkout


   Scenario: Test that a user can proceed to checkout
   
   Given as a guest user start a application
   When user add an item to the cart
   And click on My Cart
   Then the user can see the added item to the cart
   When user click on proceed to checkout
   Then user should be redirected to the checkout page OPC