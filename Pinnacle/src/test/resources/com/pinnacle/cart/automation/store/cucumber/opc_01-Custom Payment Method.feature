Feature: This feature is used to test Custom Payment Method

Scenario: Test that the user can checkout using a Custom Payment Method

Given that admin is login to the application
And admin navigate to active payment gateways
And check custom payment methods
When as a guest user start a application
And user add an item to the cart and place order
Then Ensure thank you page is displayed
When as an admin navigate to browse orders
And Check the checkbox for the new order and Set New Payment Status to Received
And Check the checkbox for the order, and Set New Order Status to Complete
Then Ensure order complete notifications
