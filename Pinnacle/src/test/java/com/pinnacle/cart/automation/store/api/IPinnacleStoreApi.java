package com.pinnacle.cart.automation.store.api;

import java.io.IOException;



/**
 * This is the master API for Pinnacle Phase 1
 * @author Abhik Khandelwal
 *
 */
public interface IPinnacleStoreApi {
	
	/**
	 * Add an item to the Cart
	 * @param Cart cart
	 * @throws Exception
	 */
	void addItemToCart() throws Exception;
	
	
	/**
	 * Remove an item from the Cart
	 * @param Cart cart
	 * @throws Exception
	 */
	void removeItemFromCart() throws Exception;
	
	
	/**
	 * Proceeding to the checkout
	 * @throws Exception
	 */
	void proceedToChekout() throws Exception;
	
	/**
	 * Updating the quantities
	 * @throws Exception
	 */
	void updateQuantities() throws Exception;
	
	/**
	 * admin logs
	 * @throws Exception
	 */
	
    void admin_login() throws Exception;
	 
	 /**
	  * click on my cart
	  * @throws Exception
	  */

    void click_my_cart() throws Exception;
		
    /**
	 * Check that item was added successfully
	 * @throws Exception
	 */	
		
    void verifyItemInCart() throws Exception;
	   

	/**
	 *Check that page redirected to checkout page  
	 * @throws Exception
	 */   

	 void verifyCheckoutPage() throws Exception;

		
	 /**
	  *Click on Red X
	  * @throws Exception
	  */	
		
	 void Red_X() throws Exception;
		 
	 /**
      *check item removed successfully
	  * @throws Exception
	  */	
		
	void verifyItemRemoveFromCart() throws Exception;
	   
	   /**
	    *Change the quantity for the added item
	    * @throws Exception
	    */
	   
	void changeQuantity() throws Exception;
	   
	   /**
	    *check quantity updated successfully
	    * @throws Exception
	    */
	   
	void verifyQuantityUpdated() throws Exception;
	   
	    /**
	    * subtotal should be recalculated correctly
	    * @throws Exception
	    */
	   
	 void recalculatedSubTotal() throws Exception;
	   
	   /**
	    * Navigate_to_Payment_Methods
	    * @throws
	    */
	   
	 void Navigate_to_Payment_Methods () throws Exception;

	/**
	 * Click Active Payment Gateways
	 *  @throws
	 */

	 void Active_Payment_Gateways() throws Exception;


	 void Fill_Up_Billing_Form() throws Exception;

	/**
	 * Select Custom Payment Method
	 *  @throws
	 */

	 void select_Custom_Payment_Method() throws Exception;

	/**
	 * click Place Order
	 *  @throws
	 */

	 void place_order() throws Exception;
	 
	 /**
	  *Ensure Thank you page
	  * @throws
	  */
	 public void Ensure_Thank_you_Page()throws Exception;

	/**
	 * Admin navigate to orders and new order should be displayed
	 *  @throws
	 */
	 
	void Navigate_To_Orders() throws Exception;

	/**
	 * click Update status and order should be displayed
	 *  @throws
	 */

	 void Update_Status() throws Exception;

	/**
	 * Check the checkbox for the new order and Set New Payment Status to Received
	 *  @throws
	 */

	void Check_New_Order_And_Set_New_Payment_Status() throws Exception;

	/**
	 * Check the checkbox for the order, and Set New Order Status to Complete
	 * @throws
	 */

	void Check_New_Order_And_Set_New_Order_Status() throws Exception;

	/**
	 * click Update status and ensure order complete notifications
	 * @throws
	 */

	 void Update_Status_And_Ensure_Order() throws Exception;

	/**
	 * admin navigate to Cart Settings to Digital Products
	 * @throws
	 */

	 void Navigate_to_Digital_Products() throws Exception;

	/**
	 * Set Digital Products Active to Yes, and click Save changes
	 * @throws
	 */

	void Set_Digital_Product_And_Save_Changes() throws Exception;


	/**
	 * Navigate to Categories & Products to Add a New Product
	 * @throws
	 */

	 void Navigate_To_Categories_And_Products_To_Add_New_Product() throws Exception;


	/**
	 * Create a product for the downloadable product
	 * @throws IOException
	 */


	 void Create_Product_For_Downloadble_Product() throws IOException;

	/**
	 * Expand Digital Product Properties
	 * @throws 
	 */
	 void Expand_Digital_Product_Properties() throws Exception;

	/**
	 * Check the checkbox for Is this a digital download
	 * @throws
	 */

	 void Check_checkbox_for_digital_download() throws Exception;

	/**
	 * provide a path for the digital download file and click Save Changes
	 * @throws
	 */

	 void Path_For_Digital_Download_File_And_Save_Changes() throws Exception;

	/**
	 * Navigate to Categories & Products to Gift Certificates
	 * @throws 
	 */

	 void Navigate_To_Categories_And_Products_To_Gift_Certificates() throws Exception;

	/**
	 *Click on Gift Certificates Settings and click the Enable Module button
	 * @throws 
	 */

	 void Click_On_Gift_Certificate_Settings_And_Click_Enable_Module() throws Exception;

	/**
	 * Click the Gift Certificates link
	 * @throws 
	 */

	 void Click_Gift_Certificate_Link() throws Exception;

	/**
	 *Fill the form and click Add To Cart
	 * @throws
	 */

	 void Fill_Form_And_Click_Add_Cart() throws Exception;

	 /**
	  *Fill the Biling form 
	  * @throws
	 */
	 void Fill_Billing_Form() throws Exception;

	/**
	 * user select Use Gift Certificate radio button
	 * @throws 
	 */

	 void Select_Gift_Certificate_Radio_Button() throws Exception;

	/**
	 * Fill up gift certifcate entries with voucher code
	 * @throws 
	 */
	 
	 void Fill_Up_Gift_Certificate() throws Exception;
	 
	 /**
	  * Enable Promo Code
	  *  @throws
	  */

	 public void Enable_Promo_Code() throws Exception;
	 
	 /**
	  * Create a new promo code
	  *  @throws
	  */
	 public void Create_New_Promo_Code() throws Exception;
	 
	 /**
	  * Promo code created
	  * @throws Exception
	  */

	 public void Promo_Code_Created() throws Exception;
	 
	 /**
	  * Add item with promo code
	  * @throws Exception
	  */
	 public void Add_Item_with_Promo_Code() throws Exception;
	 
	 /**
	  * Check discounted amount
	  * @throws Exception
	  */

	 public void Check_Discounted_Amount() throws Exception;
	 
	 /**
	  *Reterive Voucher Code
	  *@throws
	  */

	 public void Retrieve_Voucher_Code() throws Exception;
	 
	 /**
	  * Navigate to quantity discounts
	  * @throws Exception
	  */
	 public void Navigate_To_Quantity_Discounts() throws Exception;
	 
	 /**
	  * Setup a quantity discount
	  * @throws
	  */

	 public void Setup_Quantity_Discount() throws Exception;
	 
	 /**
	  * Find Product and Add To Cart
	  * @throws Exception
	  */

	 public void Find_Product_And_Add_To_Cart() throws Exception;
	 
	 
}
	
