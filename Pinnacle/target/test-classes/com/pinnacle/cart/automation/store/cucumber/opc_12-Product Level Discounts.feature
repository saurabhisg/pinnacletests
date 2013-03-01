Feature:This feature is used to test than an admin can create product level discounts, and that a user gets the correct discounts applied in their cart.

Scenario: Test than an admin can create product level discounts, and that a user gets the correct discounts applied in their cart

Given that admin is login to the application
And move on quantity discounts
When Setup a quantity discount
And as a guest user start a application
And find the product and add to cart
Then get the discount
And complete order and order total should be calculated correctly