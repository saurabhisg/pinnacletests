package com.pinnacle.cart.automation.store.ui.page;

import org.junit.Assert;

public class PinnacleCartPage extends PinnacleBasePage {
	
	/**
	 * admin navigate to Cart Settings to Payment Methods
	 */
	
	public void Navigate_to_Payment_Methods()
	{
		// Navigate to payment method
		Assert.assertTrue("Cart Settings is not Present", PinnacleUtilPage.isObjPresent("LNK_CART_SETTINGS",20));
		PinnacleUtilPage.click("LNK_CART_SETTINGS");
		PinnacleUtilPage.click("LNK_PAYMENT");
		PinnacleUtilPage.click("LNK_PAYMENT_METHODS");
		logger.info("Navigated to payment method");
	}
	
	/**
	 * Admin navigate to orders and new order should be displayed
	 */
	public void Navigate_To_Orders()
	{
		//Navigate to orders
		Assert.assertTrue("Order customer is not Present", PinnacleUtilPage.isObjPresent("LNK_ORDER_CUSTOMER",20));
		PinnacleUtilPage.click("LNK_ORDER_CUSTOMER");
		PinnacleUtilPage.click("LNK_ORDER");
		PinnacleUtilPage.sleep(3);
		logger.info("Navigated to orders");
	}

	
	/**
	 * admin navigate to Cart Settings to Digital Products
	 */
	
	public void Navigate_to_Digital_Products()
	{
		//admin navigate to Cart Settings to Digital Products
		Assert.assertTrue("Cart Settings is not Present", PinnacleUtilPage.isObjPresent("LNK_CART_SETTINGS",20));
		PinnacleUtilPage.click("LNK_CART_SETTINGS");
		PinnacleUtilPage.click("LNK_GLOBAL_SETTINGS");
		PinnacleUtilPage.click("LNK_DIGITAL_PRODUCTS");
		logger.info("Admin navigated to Cart Settings to Digital Products");
	}
	
	
	/**
	 * Navigate to Categories & Products to Add a New Product
	 */
	
	public void Navigate_To_Categories_And_Products_To_Add_New_Product()
	{
		//Navigate to Categories & Products to Add a New Product
		Assert.assertTrue("Product Category is not Present", PinnacleUtilPage.isObjPresent("LNK_PRODUCT_CATEGORY",20));
		PinnacleUtilPage.click("LNK_PRODUCT_CATEGORY");
		PinnacleUtilPage.click("LNK_ADD_PRODUCT");
		logger.info("Navigated to Categories & Products to Add a New Product");
		PinnacleUtilPage.sleep(10);
	}
	
	
	/**
	 * Navigate to Categories & Products to Gift Certificates
	 */
	
	public void Navigate_To_Categories_And_Products_To_Gift_Certificates()
	{
		//navigate to Categories & Products to Gift Certificates
		PinnacleUtilPage.click("LNK_MARKETING");
		Assert.assertTrue("Gift certificate link is not present", PinnacleUtilPage.isObjPresent("LNK_GIFT_CERTIFIACTE", 10));
		PinnacleUtilPage.click("LNK_GIFT_CERTIFIACTE");
		logger.info("Navigated to gift certificates");
	
	}
	
	/**
	 * Enable a promo code
	 */
	public void Enable_Promo_Code()
	{
		//Enable a promo code
		PinnacleUtilPage.click("LNK_CART_SETTINGS");
		PinnacleUtilPage.click("LNK_PAYMENT");
		Assert.assertTrue("Discount promo link is not clicked properly",PinnacleUtilPage.isObjPresent("LNK_DISCOUNT_PROMO",10));
		PinnacleUtilPage.click("LNK_DISCOUNT_PROMO");
		Assert.assertTrue("Promo code tab is not visible",PinnacleUtilPage.isObjPresent("TAB_PROMO",10));
		PinnacleUtilPage.click("TAB_PROMO");
		putil.selectValueInDropDown("SELCT_DISCOUNT_PROMO","Yes");
		PinnacleUtilPage.click("BTN_PROMO_SAVE_CHANGES");
		logger.info("Enabled a promo code");
	}
	
	/**
	 * Navigate to quantity discounts
	 * @throws Exception
	 */
	public void Navigate_To_Quantity_Discounts() throws Exception
	{
		//Navigate to quantity discounts
		Assert.assertTrue("Product & category link is not present",PinnacleUtilPage.isObjPresent("LNK_PRODUCT_CATEGORY", 20));
		PinnacleUtilPage.click("LNK_PRODUCT_CATEGORY");
		Assert.assertTrue("Browser Product link is not present",PinnacleUtilPage.isObjPresent("LNK_BROWSE_PRODUCT",10));
		PinnacleUtilPage.click("LNK_BROWSE_PRODUCT");
		PinnacleUtilPage.click("BTN_SEARCH");
		Assert.assertTrue("Apple Product link is not present",PinnacleUtilPage.isObjPresent("LNK_BROWSE_PRODUCT",10));
		PinnacleUtilPage.click("LNK_APPLE_PRODUCT");
		PinnacleUtilPage.sleep(8);
		PinnacleUtilPage.click("TAB_DISCOUNT");		
		logger.info("clicked on Quantity Discount");
	}
}

