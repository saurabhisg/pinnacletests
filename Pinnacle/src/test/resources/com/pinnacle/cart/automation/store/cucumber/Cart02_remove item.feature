   Feature: This feature is used to test remove item from the cart

   Scenario: Check to see if user can remove an item from the cart
   
   Given as a guest user start a application
   When user add an item to the cart
   And click on My Cart
   Then the user can see the added item to the cart
   When user click remove under the item
   Then the item should be removed
   