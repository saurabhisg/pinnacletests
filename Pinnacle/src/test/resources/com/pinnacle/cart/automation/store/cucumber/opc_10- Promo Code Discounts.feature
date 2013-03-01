Feature: This feature is used to test that an admin can enable and create promo codes, and then a user can use a promo code to receive a discount on their order.

Scenario: Test that an admin can enable and create promo codes, and that a user can use a promo code to receive a discount on their order
	
Given that admin is login to the application
When admin move to Discount/Promo code section to enable promo codes
And creates new Promo code
Then promo code should be created
When user add items to the cart with the Promo code
Then the cart total should display the discounted correct amount