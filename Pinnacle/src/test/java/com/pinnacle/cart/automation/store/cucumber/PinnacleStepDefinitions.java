package com.pinnacle.cart.automation.store.cucumber;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.pinnacle.cart.automation.store.api.impl.PinnacleStoreApiUI;
import com.pinnacle.cart.automation.store.ui.page.PinnacleUtilPage;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;


public class PinnacleStepDefinitions {
	
	final static Logger logger = LoggerFactory.getLogger(PinnacleStepDefinitions.class);
	
	private static PinnacleStoreApiUI api;
	
	private String browser;
	private String seleniumUrl;
	private String applicationUrl;
	private String admin_applicationUrl;
	private String Wiki_Url;
	private String applicationScreenMappingFile;
	private static boolean failed = false;
	private static WebDriver driver = new FirefoxDriver();
	
	
	public PinnacleStepDefinitions()
	{
			Properties initproperty = new Properties();
			Properties Orproperty = new Properties();
			
			try{
				initproperty.load(new FileInputStream(new File("src/test/resources/pinnacle-cucumber.properties")));
				Orproperty.load(new FileInputStream(new File("src/test/resources/OR.properties")));
				this.browser = initproperty.getProperty("BROWSER");
				this.seleniumUrl = initproperty.getProperty("SELENIUM_URL");
				this.applicationUrl = initproperty.getProperty("APPLICATION_URL");
				this.applicationScreenMappingFile = initproperty.getProperty("APP_OBJECT_REPO");
				this.admin_applicationUrl=initproperty.getProperty("ADMIN_APPLICATION_URL");
				this.Wiki_Url=initproperty.getProperty("WIKI_URL");
				api = new PinnacleStoreApiUI(PinnacleStepDefinitions.driver, this.browser, this.seleniumUrl, this.applicationUrl, this.applicationScreenMappingFile,Orproperty,initproperty);
				
				
			}catch(Exception e){
				
				e.printStackTrace();
			}
			
			
			 
		
	}
	
    /**
     * user logs into the application
     */
	
	
	@Given("^as a guest user start a application$")
	public void start(){
		
		try{
			// Starting a application
			api.login();
		   }
		catch(Exception e){
			
			logger.info(e.getMessage());
            failed = true;
            Assert.fail(e.getMessage());
		}
		
	}
	
	/**
     * admin logs into the application
     */
	
	@Given("^that admin is login to the application$")
	public void admin_login(){
		
		try{
			// Starting a application
			api.admin_login();
		}
		
		catch(Exception e){
			logger.info(e.getMessage());
            failed = true;
            Assert.fail(e.getMessage());
		}
	}
	
	/**
     * Navigate to  WIKI article
     */
	@Given ("^Navigate to  WIKI article$")
	public void Navigate_To_Wiki_Article()
	{
		try{
			// Navigate to  WIKI article
			driver.navigate().to(Wiki_Url);
			driver.manage().window().maximize();
			logger.info("Follow wiki url");
		}
		
		catch(Exception e){
			logger.info(e.getMessage());
            failed = true;
            Assert.fail(e.getMessage());
		}
	}
	/**
	 * user add an item to the cart
	 */
	
	@When("^user add an item to the cart$")
	public void addItemToTheCart(){
		
		try{
			
			//calling additemtocart function
			
			api.addItemToCart();
			
			
		}catch(Exception e){
			
			logger.info(e.getMessage());
            failed = true;
            Assert.fail(e.getMessage());
		}
	}
	
	/**
	 * click on My Cart
	 */
	
	@When("^click on My Cart$")
	public void clickMyCart(){
		
		try{
			    //calling click_my_cart function
			
				api.click_my_cart();
			
		}catch(Exception e){
			
			logger.info(e.getMessage());
            failed = true;
            Assert.fail(e.getMessage());
		}
	}
	
	/**
	 * user can see the added item to the cart
	 */
	
	@Then("^the user can see the added item to the cart$")
	public void verifyItemInCart(){
		
		try{
			//calling verifyItemInCart function
			
			api.verifyItemInCart();
			
			
		}catch(Exception e){
			
			logger.info(e.getMessage());
            failed = true;
            Assert.fail(e.getMessage());
		}
	}
	
	/**
	 * user click on remove under the item
	 */
	
	@When("^user click remove under the item$")
	public void removeItemFromCart(){
		
		try{
			//calling removeItemFromCart function
			
			api.removeItemFromCart();
			
		}catch(Exception e){
			
			logger.info(e.getMessage());
            failed = true;
            Assert.fail(e.getMessage());
		}
	}
	
	/**
	 * user click on Red_X
	 */
	
	@When("^user click Red X next to the item$")
	public void Red_X(){
		
		try{
			//calling Red_X function
			
			api.Red_X();
			
		}catch(Exception e){
			
			logger.info(e.getMessage());
            failed = true;
            Assert.fail(e.getMessage());
		}
	}
	
	
	/**
	 * the item should be removed
	 */
	
	@Then("^the item should be removed$")
	public void verifyItemRemoveFromCart(){
		
		try{
			//calling verifyItemRemoveFromCart function
			api.verifyItemRemoveFromCart();
			
			
		}catch(Exception e){
			
			logger.info(e.getMessage());
            failed = true;
            Assert.fail(e.getMessage());
		}
	}
	
	/**
	 * user click on proceed to checkout
	 */
	
	@When("^user click on proceed to checkout$")
	public void proceedToCheckout(){
		
		try{
			//calling proceedToChekout function
			
			api.proceedToChekout();
			
		}catch(Exception e){
			
			logger.info(e.getMessage());
            failed = true;
            Assert.fail(e.getMessage());
		}
	}
	
	/**
	 * user should be redirected to the checkout page
	 */
	
	@Then("^user should be redirected to the checkout page OPC$")
	public void verifyCheckoutPage(){
		
		try{
			//calling verifyCheckoutPage function
			
			api.verifyCheckoutPage();
			
			
		}catch(Exception e){
			
			logger.info(e.getMessage());
            failed = true;
            Assert.fail(e.getMessage());
		}
	}
	
	/**
	 * user changes the quantity for the added item
	 */
	
	@When("^user changes the quantity for the added item$")
	public void changeQuantity(){
		
		try{
			//calling changeQuantity function
			
			api.changeQuantity();
			
		}catch(Exception e){
			
			logger.info(e.getMessage());
            failed = true;
            Assert.fail(e.getMessage());
		}
	}
	
	/**
	 * click on update
	 */
	
	@When("^click on update$")
	public void clickUpdate(){
		
		try{
			//calling updateQuantities function
			
			api.updateQuantities();
			
		}catch(Exception e){
			
			logger.info(e.getMessage());
            failed = true;
            Assert.fail(e.getMessage());
		}
	}
	
	/**
	 *quantity for that item should be updated
	 */
	
	@Then("^quantity for that item should be updated$")
	public void verifyQuantityUpdated(){
		
		try{
			//calling verifyQuantityUpdated function
			
			api.verifyQuantityUpdated();
			
		}catch(Exception e){
			
			logger.info(e.getMessage());
            failed = true;
            Assert.fail(e.getMessage());
		}
	}
	
	/**
	 *sub total should be recalculated correctly
	 */
	
	@Then("^sub total should be recalculated correctly$")
	public void recalculatedSubTotal(){
		
		try{
			//calling recalculatedSubTotal function
			
			api.recalculatedSubTotal();
			
		}catch(Exception e){
			
			logger.info(e.getMessage());
            failed = true;
            Assert.fail(e.getMessage());
		}
	}
	
	/**
	 * admin navigate to active payment gateways
	 */
	
	@When("^admin navigate to active payment gateways$")
	public void Navigate_to_Active_Payment_Gateways()
	{
		try{
			// Navigate to payment method
			api.Navigate_to_Payment_Methods();
			api.Active_Payment_Gateways();
		}
		
		catch(Exception e)
		{
			logger.info(e.getMessage());
            failed = true;
            Assert.fail(e.getMessage());
		}
	}
	
	
	/**
	 * Check custom payment methods
	 */
	@And ("^check custom payment methods$")
	public void check_custom_payment_methods()
	{
		try{
			//checking custom payment method
		    api.check_custom_payment_methods();
		}
		catch(Exception e)
		{
			logger.info(e.getMessage());
            failed = true;
            Assert.fail(e.getMessage());
		}
	}
	
	/**
	 * user add an item to the cart and place order
	 */
	@And ("^user add an item to the cart and place order$")
			public void Add_Item_And_Place_Order()
	     {
			try
			{
			api.addItemToCart();
			api.click_my_cart();
			api.proceedToChekout();
			api.Fill_Up_Billing_Form();
			api.select_Custom_Payment_Method();
			api.place_order();
			}
			
			catch(Exception e)
			{
				logger.info(e.getMessage());
	            failed = true;
	            Assert.fail(e.getMessage());
			}
	     }
	
	/**
	 * Ensure thank you page is displayed and recieve notifications
	 */
	
	@Then ("^Ensure thank you page is displayed$")
	public void Ensure_Thank_you_Page()
	{
		try{
			//Ensure Thank you Page
			api.Ensure_Thank_you_Page();
		   }
		
		catch(Exception e){
			logger.info(e.getMessage());
            failed = true;
            Assert.fail(e.getMessage());
		}
		
	}
	/**
	 * Admin navigate to orders 
	 */
	
	@When ("^as an admin navigate to browse orders$")
	public void Navigate_To_Orders()
	{
		try{
			//Navigate to orders
			api.admin_login();
			api.Navigate_To_Orders();
		   }
		
		catch(Exception e){
			logger.info(e.getMessage());
            failed = true;
            Assert.fail(e.getMessage());
		}
	}
	
	/**
	 * Check the checkbox for the new order and Set New Payment Status to Received
	 */
	
	@And ("^Check the checkbox for the new order and Set New Payment Status to Received$")
	public void Check_New_Order_And_Set_New_Payment_Status()
	{
		try{
			//Check new order and set new payment status
			api.Check_New_Order_And_Set_New_Payment_Status();
			api.Update_Status();
		   }
		
		catch(Exception e)
		{
		logger.info(e.getMessage());
        failed = true;
        Assert.fail(e.getMessage());
		}
	}
	
	
	/**
	 * Check the checkbox for the order, and Set New Order Status to Complete
	 */
	
	@Then ("^Check the checkbox for the order, and Set New Order Status to Complete$")
	public void Check_New_Order_And_Set_New_Order_Status()
	{
		try{
			//Check new order and set new order status
			api.Check_New_Order_And_Set_New_Order_Status();
		   }
		
		catch(Exception e)
		{
		logger.info(e.getMessage());
        failed = true;
        Assert.fail(e.getMessage());
		}
	}
	
	/**
	 * Ensure order complete notifications
	 */
	@Then  ("^Ensure order complete notifications$")
	public void Ensure_Order()
	{
		try{
			//ensure order
			api.Update_Status_And_Ensure_Order();
		   }
		
		catch(Exception e)
		{
		logger.info(e.getMessage());
        failed = true;
        Assert.fail(e.getMessage());
		}
		
	}
	
	/**
	 * admin navigate to Cart Settings to Digital Products
	 */
	
	@When("^admin navigate to Cart Settings to Digital Products$")
	public void Navigate_to_Digital_Products()
	{
		try{
			//navigate to Cart Settings to Digital Products
			api.Navigate_to_Digital_Products();
		   }
		
		catch(Exception e)
		{
		logger.info(e.getMessage());
        failed = true;
        Assert.fail(e.getMessage());
		}
		
	}
	
	/**
	 * Set Digital Products Active to Yes, and click Save changes
	 */
	
	@Then ("^Set Digital Products Active to Yes, and click Save changes$")
	public void Set_Digital_Product_And_Save_Changes()
	{
		try{
			//Set Digital Products Active to Yes, and click Save changes
			api.Set_Digital_Product_And_Save_Changes();
		   }
		
		catch(Exception e)
		{
		logger.info(e.getMessage());
        failed = true;
        Assert.fail(e.getMessage());
		}
	}
	
	/**
	 * Navigate to Categories & Products to Add a New Product
	 */
	@Then ("^Navigate to Categories & Products to Add a New Product$")
	public void Navigate_To_Categories_And_Products_To_Add_New_Product()
	{
		try{
			//Navigate to Categories & Products to Add a New Product
			api.Navigate_To_Categories_And_Products_To_Add_New_Product();
		   }
		
		catch(Exception e)
		{
		logger.info(e.getMessage());
        failed = true;
        Assert.fail(e.getMessage());
		}
	}
	/**
	 * Create a product for the downloadable product
	 * @throws IOException
	 */
	
	@And ("^Create a product for the downloadable product$")
	public void Create_Product_For_Downloadble_Product() throws IOException
	{
		//Create a product for the downloadable product
		api.Create_Product_For_Downloadble_Product();
	}
	
	/**
	 * Expand Digital Product Properties
	 */
	@Then ("^Expand Digital Product Properties$")
	public void Expand_Digital_Product_Properties()
	{
		try{
			//Expand Digital Product Properties
		api.Expand_Digital_Product_Properties();
		}
		catch(Exception e)
		{
		logger.info(e.getMessage());
        failed = true;
        Assert.fail(e.getMessage());
		}
	}
	
	/**
	 * Check the checkbox for Is this a digital download
	 */
	@And ("^Check the checkbox for Is this a digital download$")
	public void Check_checkbox_for_digital_download()
	{
		try{
			//Check the checkbox for Is this a digital download
		api.Check_checkbox_for_digital_download();
		}
		catch(Exception e)
		{
		logger.info(e.getMessage());
        failed = true;
        Assert.fail(e.getMessage());
		}
	}
	
	/**
	 * provide a path for the digital download file and click Save Changes
	 */
	
	@And ("^provide a path for the digital download file and click Save Changes$")
	public void Path_For_Digital_Download_File_And_Save_Changes()
	{
		try{
			//provide a path for the digital download file and click Save Changes
		api.Path_For_Digital_Download_File_And_Save_Changes();
		   }
		catch(Exception e)
		{
		logger.info(e.getMessage());
        failed = true;
        Assert.fail(e.getMessage());
		}
	}
	
	/**
	 * Navigate to Categories & Products to Gift Certificates
	 */
	
	@When ("^navigate to Categories & Products to Gift Certificates$")
	public void Navigate_To_Categories_And_Products_To_Gift_Certificates()
	{
		try
		{
			//navigate to Categories & Products to Gift Certificates
			api.Navigate_To_Categories_And_Products_To_Gift_Certificates();
		}
	
	catch(Exception e)
	{
	logger.info(e.getMessage());
    failed = true;
    Assert.fail(e.getMessage());
	}
	}
	
	/**
	 *Click on Gift Certificates Settings and click the Enable Module button
	 */
	
	@And ("^go to Gift Certificates Settings and move to Enable Module button$")
	public void Click_On_Gift_Certificate_Settings_And_Click_Enable_Module()
	{
		try
		{
			//Click on Gift Certificates Settings and click the Enable Module button
			api.Click_On_Gift_Certificate_Settings_And_Click_Enable_Module();
		}
	
	catch(Exception e)
	{
	logger.info(e.getMessage());
    failed = true;
    Assert.fail(e.getMessage());
	}
	}
	
	/**
	 * Click the Gift Certificates link
	 */
	@And ("^navigate to Gift Certificates link$")
	public void Click_Gift_Certificate_Link()
	{
		try
		{
			//Click the Gift Certificates link
			api.Click_Gift_Certificate_Link();
		}
	
	catch(Exception e)
	{
	logger.info(e.getMessage());
    failed = true;
    Assert.fail(e.getMessage());
	}
	}
	
	/**
	 *Fill the form and click Add To Cart
	 */
	@When("^user fill the from and add item to cart$")
	public void Fill_Form_And_Click_Add_Cart()
	{
		try{
		//Fill the form and click Add To Cart
		api.Fill_Form_And_Click_Add_Cart();
		   }
		catch(Exception e)
		{
		logger.info(e.getMessage());
	    failed = true;
	    Assert.fail(e.getMessage());
		}
	}
	
	/**
	 * Proceed to checkout, and complete the order
	 */
	
	@And("^Proceed to checkout$")
	public void Proceed_To_Checkout_And_Complete_Order()
	{
		try {
			//Proceed_To_Checkout_And_Complete_Order
			api.proceedToChekout();
			api.Fill_Billing_Form();
			api.select_Custom_Payment_Method();
			api.place_order();
		} 
		catch(Exception e)
		{
			logger.info(e.getMessage());
		    failed = true;
		    Assert.fail(e.getMessage());
			}
		
	}
	
	/**
	 * find the order and status it to Completed, payment Received and ensure the email contains a Voucher Code
	 */
	@Then("^order status should be complete,payment received and ensure email contains Voucher code$")
	public void find_the_order_and_status_it_to_Completed_payment_Received_and_ensure_the_email_contains_a_Voucher_Code() {
		try {
			//find the order and status it to Completed, payment Received and ensure the email contains a Voucher Code
			api.admin_login();
			api.Navigate_To_Orders();
			api.Check_New_Order_And_Set_New_Payment_Status();
			api.Update_Status();
			api.Check_New_Order_And_Set_New_Order_Status();
			api.Update_Status_And_Ensure_Order();
		}
		catch(Exception e)
		{
			logger.info(e.getMessage());
		    failed = true;
		    Assert.fail(e.getMessage());
			}
		
		
	}
	
	/**
	 * Retrieve a voucher code from previous test
	 */
	
	@Given("^Retrieve a voucher from previous test$")
	
	public void Retrieve_Voucher_Code()
	{
		try
		{
			//Retrieve a voucher code from previous test
		   api.admin_login();
		   api.Navigate_To_Categories_And_Products_To_Gift_Certificates();
		   api.Retrieve_Voucher_Code();
		}
		catch(Exception e)
		{
			logger.info(e.getMessage());
		    failed = true;
		    Assert.fail(e.getMessage());
			}
	}
	
	/**
	 * User add an item to cart and move to my cart
	 */
	@When ("^user add an item to cart and move to My cart$")
	public void Add_Item_And_Move_To_My_Cart()
	{
		try{
			//User add an item to cart and move to my cart
		   api.addItemToCart();
		   api.click_my_cart();
		   }
		
		catch(Exception e)
		    {
			logger.info(e.getMessage());
		    failed = true;
		    Assert.fail(e.getMessage());
			}
		
	}
	
	
	
	/**
	 * Fill up gift certifcate entries with voucher code
	 */
	@And ("^Fill up gift certifcate entries with voucher code$")
	public void Fill_Up_Gift_Certificate()
	{
		try{
		    //Fill up gift certifcate entries with voucher code
			api.Select_Gift_Certificate_Radio_Button();
		    api.Fill_Up_Gift_Certificate();
		  }
		catch(Exception e)
		{
			logger.info(e.getMessage());
		    failed = true;
		    Assert.fail(e.getMessage());
			}
		
	}
	
	/**
	 * Fill up billing information,Shipping Address and Method
	 */
	
	@And("^Fill up billing information,Shipping Address and Method$")
			public void Fill_Form()
	       {
		
		try{
			//Fill up billing information,Shipping Address and Method
			api.proceedToChekout();
			api.Fill_Up_Billing_Form();
		   }
		
		catch(Exception e)
		    {
			logger.info(e.getMessage());
		    failed = true;
		    Assert.fail(e.getMessage());
			}
		
	}
	
	/**
	 *  Check gift certificate funds
	 */
	
	@And ("^If gift certificate cannot have enough payment$")
	public void Check_Gift_Certificate_Fund()
	{
		try
		{
			//If the gift certificate didn't have enough funds,use another form of payment
		   // api.select_Custom_Payment_Method();
		}
		
		catch(Exception e)
		{
			logger.info(e.getMessage());
		    failed = true;
		    Assert.fail(e.getMessage());
			}
	}
		
	/**
	 * use other mode of payment
	 */
		@Then ("^use other mode of payment$")
		public void Mode_Of_Payment()
		{
			try{
				//Select other mode of payment
				api.select_Custom_Payment_Method();
			    }
			catch(Exception e)
			{
				logger.info(e.getMessage());
			    failed = true;
			    Assert.fail(e.getMessage());
				}
			
		}
	/**
	 * complete order
	 */
	
	@And ("^order should be complete$")
	public void Complete_Order()
	{
		try
		{
			//complete order
			api.place_order();
		}
		catch(Exception e)
		{
			logger.info(e.getMessage());
		    failed = true;
		    Assert.fail(e.getMessage());
			}
	}
	/**
	 * Enable a Promo Code
	 */
	@When ("^admin move to Discount/Promo code section to enable promo codes$")
	public void Enable_Promo_Code()
	{
		try{
			  //Enable a Promo Code
		      api.Enable_Promo_Code();
		   }
		catch(Exception e)
		{
			logger.info(e.getMessage());
		    failed = true;
		    Assert.fail(e.getMessage());
			}
	}
	
	/**
	 * Create a new Promo Code
	 */
	
	@And ("^creates new Promo code$")
	public void Create_New_Promo_Code()
	{
		try{
			//Create a new Promo Code
		api.Create_New_Promo_Code();
		  }
		catch(Exception e)
		{
			logger.info(e.getMessage());
		    failed = true;
		    Assert.fail(e.getMessage());
			}
	}
	
	/**
	 * Promo code should be created
	 */
	@Then ("^promo code should be created$")
	public void Promo_Code_Created()
	{
		try{
			//Promo code should be created
		api.Promo_Code_Created();
		   }
		catch(Exception e)
		{
			logger.info(e.getMessage());
		    failed = true;
		    Assert.fail(e.getMessage());
			}
	}
	/**
	 * Add Item to the cart with promo code
	 */
	@When ("^user add items to the cart with the Promo code$")
	public void Add_Item_with_Promo_Code()
	{
		try{
			//Add Item to the cart with promo code
			api.login();
		    api.addItemToCart();
		    api.click_my_cart();
		    api.changeQuantity();
		    api.updateQuantities();
		    api.proceedToChekout();
		    api.Add_Item_with_Promo_Code();
		    }
		   catch(Exception e)
		    {
			logger.info(e.getMessage());
		    failed = true;
		    Assert.fail(e.getMessage());
			}
	}
	
	/**
	 * cart total should display the discounted correct amount
	 */
	@Then ("^the cart total should display the discounted correct amount$")
	public void Check_Discounted_Amount()
	{
		try{
			//cart total should display the discounted correct amount
		   api.Check_Discounted_Amount();
		   api.select_Custom_Payment_Method();
		   api.place_order();
		   }
		catch(Exception e)
	    {
		logger.info(e.getMessage());
	    failed = true;
	    Assert.fail(e.getMessage());
		}
	}
	
	/**
	 * move on quantity discounts
	 */
	@And ("^move on quantity discounts$")
	public void Navigate_To_Quantity_Discounts()
	{
		try
		{
			//move on quantity discounts
		    api.Navigate_To_Quantity_Discounts();
		}
		
		catch(Exception e)
	    {
		logger.info(e.getMessage());
	    failed = true;
	    Assert.fail(e.getMessage());
		}
	}
	/**
	 * Setup a quantity discount
	 */
	
	@When ("^Setup a quantity discount$")
	public void Setup_Quantity_Discount()
	{
		try
		{
		//Setup a quantity discount
		api.Setup_Quantity_Discount();	
		}
		
		catch(Exception e)
	    {
		logger.info(e.getMessage());
	    failed = true;
	    Assert.fail(e.getMessage());
		}
	}
	/**
	 * Find the product and add to cart
	 */
	@And ("^find the product and add to cart$")
	public void Find_Product_And_Add_To_Cart()
	{
		try
		{
			//Find the product and add to cart
			api.Find_Product_And_Add_To_Cart();
			
		}
		
		catch(Exception e)
	    {
		logger.info(e.getMessage());
	    failed = true;
	    Assert.fail(e.getMessage());
		}
		
	}
	/**
	 * Get a discount
	 */
	@Then ("^get the discount$")
	public void Get_Discount()
	{
		try
		{
			//Get a discount
			api.click_my_cart();
			api.changeQuantity();
			api.updateQuantities();
		}
		
		catch(Exception e)
	    {
		logger.info(e.getMessage());
	    failed = true;
	    Assert.fail(e.getMessage());
		}
	}
	
	/**
	 * Complete Order and Order total should be calculated correctly
	 */
	
	@And ("^complete order and order total should be calculated correctly$")
	public void Complete_Order_And_Total_Calculated()
	{
		try
		{
		//Complete Order and Order total should be calculated correctly
		api.recalculatedSubTotal();
		api.proceedToChekout();
		api.Fill_Up_Billing_Form();
		api.place_order();
		}
		
		catch(Exception e)
	    {
		logger.info(e.getMessage());
	    failed = true;
	    Assert.fail(e.getMessage());
		}
		
	}
}