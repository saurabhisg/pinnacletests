Feature: This feature is used to test remove an item from the cart using the cart widget

Scenario:Test that a user can remove an item from the cart using the cart widget

Given as a guest user start a application
When user add an item to the cart
And click on My Cart
Then the user can see the added item to the cart
When user click Red X next to the item
Then the item should be removed