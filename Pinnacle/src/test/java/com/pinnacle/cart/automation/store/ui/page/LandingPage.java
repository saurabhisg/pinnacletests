package com.pinnacle.cart.automation.store.ui.page;


import org.junit.Assert;


	
public class LandingPage extends PinnacleBasePage
{
	
	
	
	public LandingPage()
	{
		
	}
	
	
	/**
	 * add an item to the cart
	 * @throws
	 */
	
	public  void addItemToCart() throws Exception {
		// Add an item to the cart
	
		PinnacleUtilPage.click("BTN_TO_ADD_CART");
		logger.info("add an item to the cart");
		Assert.assertTrue("Add to cart button is not present",PinnacleUtilPage.isObjPresent("BTN_TO_ADD_MYCART", 10));
		PinnacleUtilPage.click("BTN_TO_ADD_MYCART");
	}
	
	/**
	 * click on my cart
	 * @throws Exception
	 */

	public  void click_my_cart() throws Exception{
		// Click on my cart
		PinnacleUtilPage.click("LNK_TO_MYCART");
		logger.info("Click My Cart");
		
	}
	/**
	 * User logs in a application
	 * @throws Exception
	 */
	
	public void login() throws Exception
	{
		driver.manage().window().maximize();
		driver.navigate().to(initproperty.getProperty("APPLICATION_URL"));
		logger.info("As a guest user start a application ");
	}
	/**
	 * admin logs
	 * @throws Exception
	 */
	
	public void admin_login() throws Exception
	{
		// admin logs with credententials in a application
		driver.manage().window().maximize();
		driver.navigate().to(initproperty.getProperty("ADMIN_APPLICATION_URL"));
		Assert.assertTrue("textbox is not present", PinnacleUtilPage.isObjPresent("TXT_USERNAME", 10));
		PinnacleUtilPage.setText("TXT_USERNAME", initproperty.getProperty("ADMIN_USERNAME"));
		PinnacleUtilPage.setText("TXT_PASSWORD", initproperty.getProperty("ADMIN_PASSWORD"));
		PinnacleUtilPage.click("BTN_LOGIN");
		logger.info("admin login with credentials in a application");
		PinnacleUtilPage.sleep(5);
	}
	
	/**
	 * Find Product and Add To Cart
	 * @throws Exception
	 */

	public void Find_Product_And_Add_To_Cart() throws Exception
	{
		PinnacleUtilPage.click("LNK_TABLET");
		Assert.assertTrue("Add to cart button is not present", PinnacleUtilPage.isObjPresent("BTN_G_ADD_CART",20));
		PinnacleUtilPage.click("BTN_G_ADD_CART");
	}
}