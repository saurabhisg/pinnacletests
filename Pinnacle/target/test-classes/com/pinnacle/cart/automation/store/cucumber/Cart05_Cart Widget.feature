Feature: This feature is used to test Cart Widget

Scenario: Test that a user can add an item to the cart, and item is displayed by cart widget

Given as a guest user start a application
When user add an item to the cart
And click on My Cart
Then the user can see the added item to the cart
