   Feature: This feature is used to test update quantities

   Scenario: Test that a user can update quantities of an item in the cart
   Given as a guest user start a application
   When user add an item to the cart
   And click on My Cart
   Then the user can see the added item to the cart
   When user changes the quantity for the added item
   And click on update
   Then quantity for that item should be updated
   And sub total should be recalculated correctly