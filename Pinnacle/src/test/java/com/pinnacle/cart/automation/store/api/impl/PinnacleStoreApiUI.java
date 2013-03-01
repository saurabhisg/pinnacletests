package com.pinnacle.cart.automation.store.api.impl;


import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pinnacle.cart.automation.store.api.IPinnacleStoreApi;
import com.pinnacle.cart.automation.store.ui.page.*;


public class PinnacleStoreApiUI implements IPinnacleStoreApi  {
	
	
	final   static Logger logger = LoggerFactory.getLogger(PinnacleStoreApiUI.class.getName());
	public  static LandingPage lp;
	public  static CartWidgetPage cwp;
	public  static PinnacleCartPage pc;
	public  static CheckOutPage cop;
	static  boolean isloggedin = false;
	private static WebDriver driver;
	public static PinnacleBasePage PBP;
	public static PaymentMethodsPage PMP;
	public static OrderPage OP;
	public static DigitalProductPage DPP;
	public static Downloadable_Product DLP;
	public static GiftCerificatePage GCP;
	public static DiscountPage DP;
	public static PlaceOrderPage POP;
	public static ProductPage PP;

	public PinnacleStoreApiUI(WebDriver driver, String browser, String seleniumUrl, String applicationUrl, String applicationScreenMappingFile,Properties Orproperty,Properties initproperty)
	{
		PBP = new PinnacleBasePage(driver, browser, seleniumUrl, applicationUrl, applicationScreenMappingFile, Orproperty,initproperty);
		this.driver=driver;
		lp= new LandingPage();
		cwp=new CartWidgetPage();	
		pc= new PinnacleCartPage();
		cop=new CheckOutPage();
		PMP=new PaymentMethodsPage();
		OP= new OrderPage();
		DPP=new DigitalProductPage();
		DLP=new Downloadable_Product();
		GCP=new GiftCerificatePage();
		DP= new DiscountPage();
		POP=new PlaceOrderPage();
		PP= new ProductPage();
	}
	
	/**
	 * User logs in a application
	 * @throws Exception
	 */
	
	public void login() throws Exception
	{
		lp.login();
	}
	
	/**
	 * admin logs
	 * @throws Exception
	 */
	
	public void admin_login() throws Exception
	{
		lp.admin_login();
	}
	
	/**
	 * add an item to the cart
	 * @throws Exception 
	 */
	
	public  void addItemToCart() throws Exception {
		// Add an item to the cart
		
		lp.addItemToCart();
		
	}
	
	/**
	 * click on my cart
	 * @throws Exception
	 */

	public  void click_my_cart() throws Exception{
		// Click on my cart
		
		lp.click_my_cart();
	}
	
	/**
	 * Check that item was added successfully
	 * @throws Exception
	 */
	
   public void verifyItemInCart() throws Exception{
			
    	// Check that item was added successfully
    	
			cwp.verifyItemInCart();
    }
	
    /**
     *Click on proceed to checkout
     *@throws Exception
     */
    
	public void proceedToChekout() throws Exception {
		// Click on proceed to checkout
		
		cwp.proceedToChekout();
		
	}
	
	/**
	 *Check that page redirected to checkout page  
	 * @throws Exception
	 */

    public void verifyCheckoutPage() throws Exception{
		// Check that page redirected to checkout page 
			
			cop.verifyCheckoutPage();
  
    }
    
    /**
     *Click on remove under the item
     * @throws Exception
     */
    
	public void removeItemFromCart() throws Exception {
		//Click on remove under the item
		
		cwp.removeItemFromCart();
		
	}
	
	/**
     *Click on Red X
     * @throws Exception
     */
	
	 public void Red_X() throws Exception {
		//calling Red_X function
		 cwp.Red_X();
	 }

	/**
	 *check item removed successfully
	 * @throws Exception
	 */
	
	
   public void verifyItemRemoveFromCart() throws Exception{
			// check item removed successfully
	   
			cwp.verifyItemRemoveFromCart();
   }	
		
   /**
    *Change the quantity for the added item
    * @throws Exception
    */
   
   public void changeQuantity() throws Exception{
		
	   //Change the quantity for the added item
			
			cwp.changeQuantity();
   }
   
   /**
    *click on update
    * @throws Exception
    */
   
   public void updateQuantities() throws Exception {
		// click on update 
	   
		cwp.updateQuantities();
	}
	
   /**
    *check quantity updated successfully
    * @throws Exception
    */
   
   public void verifyQuantityUpdated() throws Exception{
		//check quantity updated successfully
			
			cwp.verifyQuantityUpdated();
   }
   
   /**
    * subtotal should be recalculated correctly
    * @throws Exception
    */
   
   public void recalculatedSubTotal() throws Exception{
	   //check subtotal should be recalculated correctly
	   cwp.recalculatedSubTotal();
	   
	   
   }
   
   /**
    * Navigate_to_Payment_Methods
    * @throws
    */
   
public void Navigate_to_Payment_Methods () throws Exception
{
	// Navigate to payment method
	pc.Navigate_to_Payment_Methods();
}

/**
 * Click Active Payment Gateways
 *  @throws
 */

public void Active_Payment_Gateways() throws Exception
{
	//Active_Payment_Gateways
	PMP.Active_Payment_Gateways();
}

/**
 * If no custom payment methods
 *  @throws
 */

public void check_custom_payment_methods() throws Exception
{
	//checking custom payment method
	if(PMP.check_custom_payment_methods()==false)
	{
		PMP.Add_new_custom_payment_method();
		PMP.Fill_form();
		PMP.Save_Changes();
	}
}

/**
 * If custom payment methods available
 *  @throws
 */

public void Fill_Up_Billing_Form() throws Exception
{
	//Filling a biling form
	cop.Fill_Up_Billing_Form();
}

/**
 * Select Custom Payment Method
 *  @throws
 */

public void select_Custom_Payment_Method() throws Exception
{
	//selecting a Custom Payment Method
	cop.select_Custom_Payment_Method();
}

/**
 * click Place Order
 *  @throws
 */

public void place_order() throws Exception
{
	//Placing a order
   POP.place_order();	
}

/**
 *Ensure Thank you page
 * @throws
 */
public void Ensure_Thank_you_Page()throws Exception
{
	//Ensure Thank you page
	POP.Ensure_Thank_you_Page();
}
/**
 * Admin navigate to orders and new order should be displayed
 *  @throws
 */
public void Navigate_To_Orders() throws Exception
{
	//Navigate to orders
	pc.Navigate_To_Orders();
}

/**
 * click Update status and order should be displayed
 *  @throws
 */

public void Update_Status() throws Exception
{
	//Update Status
	OP.Update_Status();
}

/**
 * Check the checkbox for the new order and Set New Payment Status to Received
 *  @throws
 */

public void Check_New_Order_And_Set_New_Payment_Status() throws Exception
{
	//Check new order and set new payment status
	OP.Check_New_Order_And_Set_New_Payment_Status();
}

/**
 * Check the checkbox for the order, and Set New Order Status to Complete
 * @throws
 */

public void Check_New_Order_And_Set_New_Order_Status() throws Exception
{
	//Check new order and set new order status
	OP.Check_New_Order_And_Set_New_Order_Status();
}

/**
 * click Update status and ensure order complete notifications
 * @throws
 */

public void Update_Status_And_Ensure_Order() throws Exception
{
	//Update status and ensure order
	OP.Update_Status();
	logger.info("Update status and ensure order complete notifications");
}

/**
 * admin navigate to Cart Settings to Digital Products
 *  @throws
 */

public void Navigate_to_Digital_Products() throws Exception
{
	//admin navigate to Cart Settings to Digital Products
	pc.Navigate_to_Digital_Products();
}

/**
 * Set Digital Products Active to Yes, and click Save changes
 *  @throws
 */

public void Set_Digital_Product_And_Save_Changes() throws Exception
{
	//Set Digital Products Active to Yes, and click Save changes
	DPP.Set_Digital_Product_And_Save_Changes();
}


/**
 * Navigate to Categories & Products to Add a New Product
 *  @throws
 */

public void Navigate_To_Categories_And_Products_To_Add_New_Product() throws Exception
{
	//Navigate to Categories & Products to Add a New Product
	pc.Navigate_To_Categories_And_Products_To_Add_New_Product();
}

/**
 * Create a product for the downloadable product
 * @throws IOException
 */


public void Create_Product_For_Downloadble_Product() throws IOException
{
	//Create a product for the downloadable product
	DLP.Create_Product_For_Downloadble_Product();
}

/**
 * Expand Digital Product Properties
 *  @throws
 */
public void Expand_Digital_Product_Properties() throws Exception
{
	//Expand Digital Product Properties
	DLP.Expand_Digital_Product_Properties();
}

/**
 * Check the checkbox for Is this a digital download
 *  @throws
 */

public void Check_checkbox_for_digital_download() throws Exception
{
	//Check the checkbox for Is this a digital download
	DLP.Check_checkbox_for_digital_download();
}

/**
 * provide a path for the digital download file and click Save Changes
 *  @throws
 */

public void Path_For_Digital_Download_File_And_Save_Changes() throws Exception
{
	//provide a path for the digital download file and click Save Changes
DLP.Path_For_Digital_Download_File_And_Save_Changes();	
}

/**
 * Navigate to Categories & Products to Gift Certificates
 *  @throws
 */

public void Navigate_To_Categories_And_Products_To_Gift_Certificates() throws Exception
{
	//Navigate to Categories & Products to Gift Certificates
	pc.Navigate_To_Categories_And_Products_To_Gift_Certificates();
}

/**
 *Click on Gift Certificates Settings and click the Enable Module button
 *  @throws
 */

public void Click_On_Gift_Certificate_Settings_And_Click_Enable_Module() throws Exception
{
	//Click on Gift Certificates Settings and click the Enable Module button
	GCP.Click_On_Gift_Certificate_Settings_And_Click_Enable_Module();
}

/**
 * Click the Gift Certificates link
 *  @throws
 */

public void Click_Gift_Certificate_Link() throws Exception
{
	//Click the Gift Certificates link
GCP.Click_Gift_Certificate_Link();
}

/**
 *Fill the form and click Add To Cart
 *  @throws
 */

public void Fill_Form_And_Click_Add_Cart() throws Exception
{
	//Fill the form and click Add To Cart
	GCP.Fill_Form_And_Click_Add_Cart();
}

public void Fill_Billing_Form()
{
	cop.Fill_Billing_Form();
}

/**
 * user select Use Gift Certificate radio button
 *  @throws
 */

public void Select_Gift_Certificate_Radio_Button() throws Exception
{
	//user select Use Gift Certificate radio button
	cop.Select_Gift_Certificate_Radio_Button();
}


/**
 * Fill up gift certifcate entries with voucher code
 *  @throws
 */
 
public void Fill_Up_Gift_Certificate() throws Exception
{
	//Fill up gift certifcate entries with voucher code
	cop.Fill_Up_Gift_Certificate();
}

/**
 * Enable Promo Code
 *  @throws
 */

public void Enable_Promo_Code() throws Exception
{
	//Enable Promo Code
	pc.Enable_Promo_Code();
}

/**
 * Create a new promo code
 *  @throws
 */
public void Create_New_Promo_Code() throws Exception
{
	//Create a new promo code
	DP.Create_New_Promo_Code();
}

/**
 * Promo code created
 * @throws Exception
 */
public void Promo_Code_Created() throws Exception
{
	//Promo code created
	DP.Promo_Code_Created();
}

/**
 * Add item with promo code
 * @throws Exception
 */
public void Add_Item_with_Promo_Code() throws Exception
{
	//Add item with promo code
	cop.Add_Item_with_Promo_Code();
}

/**
 * Check discounted amount
 * @throws Exception
 */

public void Check_Discounted_Amount() throws Exception
{
	//Check discounted amount
	cop.Check_Discounted_Amount();
}
/**
 *Reterive Voucher Code
 *@throws
 */

public void Retrieve_Voucher_Code() throws Exception
{
	//Reterive Voucher Code
	GCP.Retrieve_Voucher_Code();
}

/**
 * Navigate to quantity discounts
 * @throws Exception
 */
public void Navigate_To_Quantity_Discounts() throws Exception
{
	//Navigate to quantity discounts
	pc.Navigate_To_Quantity_Discounts();
}

/**
 * Setup a quantity discount
 * @throws
 */

public void Setup_Quantity_Discount() throws Exception
{
	//Setup a quantity discount
	PP.Setup_Quantity_Discount();
}

/**
 * Find Product and Add To Cart
 * @throws Exception
 */

public void Find_Product_And_Add_To_Cart() throws Exception
{
	//Find Product and Add To Cart
	lp.Find_Product_And_Add_To_Cart();
}
}