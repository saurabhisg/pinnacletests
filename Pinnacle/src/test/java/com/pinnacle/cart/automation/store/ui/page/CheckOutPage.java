package com.pinnacle.cart.automation.store.ui.page;

import org.junit.Assert;
public class CheckOutPage extends PinnacleBasePage {


	
	
	/**
	 *Check that page redirected to checkout page  
	 */

    public void verifyCheckoutPage(){
		// Check that page redirected to checkout page 
			 PinnacleUtilPage.sleep(5);
			Assert.assertTrue(driver.getPageSource().contains("Checkout"));
			logger.info("Redirected to the checkout page");
  
    }
    
    /**
	 * Fill up billing information, Shipping Address or Method
	 */
    
    public void Fill_Up_Billing_Form()
    {
    	//Filling a biling form
    	PinnacleUtilPage.sleep(8);
    	Assert.assertTrue("Firstname text is not present", PinnacleUtilPage.isObjPresent("TXT_FIRSTNAME", 10));
    	PinnacleUtilPage.setText("TXT_FIRSTNAME", "Abhik");
    	PinnacleUtilPage.setText("TXT_LASTNAME","Khandelwal");
    	PinnacleUtilPage.setText("TXT_ADDRESS", "Location1");
    	PinnacleUtilPage.setText("TXT_CITY", "Bangalore");
    	putil.selectValueInDropDown("SELCT_COUNTRY","India");
    	PinnacleUtilPage.setText("TXT_STATE","Karnataka");
    	PinnacleUtilPage.setText("TXT_ZIP", "560076");
    	PinnacleUtilPage.setText("TXT_PHONE", "987564321");
    	PinnacleUtilPage.setText("TXT_EMAIL", "abhik01.khandelwal@gmail.com");
    	PinnacleUtilPage.click("RAD_USE_THIS_SHIP_ADDRESS");
    	PinnacleUtilPage.click("BTN_CONTINUE_ORDER");
    	PinnacleUtilPage.sleep(5);
    	
    	logger.info("Filled up billing information, Shipping Address or Method");
    }
    
    /**
	 * Select Custom Payment Method
	 */
    
    public void select_Custom_Payment_Method()
    {
    	//selecting a Custom Payment Method
    	Assert.assertTrue("Radio Button is not present",PinnacleUtilPage.isObjPresent("RAD_CUSTOM_PAYMENT_METHOD",10));
    	PinnacleUtilPage.click("RAD_CUSTOM_PAYMENT_METHOD");
    	logger.info("Selected Custom Payment Method");
    }
    
   
    /**
     * Filling a biling form
     */
    public void Fill_Billing_Form()
    {
    	//Filling a biling form
    	PinnacleUtilPage.sleep(8);
    	Assert.assertTrue("Firstname text is not present",PinnacleUtilPage.isObjPresent("TXT_FIRSTNAME",10));
    	PinnacleUtilPage.setText("TXT_FIRSTNAME", "Abhik");
    	PinnacleUtilPage.setText("TXT_LASTNAME","Khandelwal");
    	PinnacleUtilPage.setText("TXT_ADDRESS", "Location1");
    	PinnacleUtilPage.setText("TXT_CITY", "Bangalore");
    	putil.selectValueInDropDown("SELCT_COUNTRY","India");
    	PinnacleUtilPage.setText("TXT_STATE","Karnataka");
    	PinnacleUtilPage.setText("TXT_ZIP", "560076");
    	PinnacleUtilPage.setText("TXT_PHONE", "987564321");
    	PinnacleUtilPage.setText("TXT_EMAIL", "abhik01.khandelwal@gmail.com");
    	PinnacleUtilPage.click("BTN_CONTINUE_ORDER");
    	PinnacleUtilPage.sleep(5);
    	
    	logger.info("Filled up billing information");
    }
    
    /**
	 * user select Use Gift Certificate radio button
	 */
	 
    
    public void Select_Gift_Certificate_Radio_Button()
	{
    	//user select Use Gift Certificate radio button
    	PinnacleUtilPage.click("RAD_USE_GIFT_CERTIFICATE");
    	logger.info("Selected gift certificate radio button");
	}
    
    
   	/**
   	 * Fill up gift certifcate entries with voucher code
   	 */
    
    public void Fill_Up_Gift_Certificate()
	{
    	//Fill up gift certifcate entries with voucher code
    	Assert.assertTrue("Firstname text is not present",PinnacleUtilPage.isObjPresent("TXT_GIFT_FIRSTNAME",10));
    	PinnacleUtilPage.setText("TXT_GIFT_FIRSTNAME","Abhik");
    	PinnacleUtilPage.setText("TXT_GIFT_LASTNAME", "Khandelwal");
    	PinnacleUtilPage.setText("TXT_GIFT_VOUCHER",Vocher_Number);
    	PinnacleUtilPage.click("BTN_GIFT_APPLY");
    	PinnacleUtilPage.sleep(3);
    	logger.info("Filled up gift certificate with voucher code");
	}
    /**
     * Add a Item with Promo Code
     */
    
    public void Add_Item_with_Promo_Code()
	{
    	//Add a Item with Promo Code
    	PinnacleUtilPage.sleep(8);
    	PinnacleUtilPage.setText("TXT_FIRSTNAME", "Abhik");
    	PinnacleUtilPage.setText("TXT_LASTNAME","Khandelwal");
    	PinnacleUtilPage.setText("TXT_ADDRESS", "Location1");
    	PinnacleUtilPage.setText("TXT_CITY", "Bangalore");
    	putil.selectValueInDropDown("SELCT_COUNTRY","India");
    	PinnacleUtilPage.setText("TXT_STATE","Karnataka");
    	PinnacleUtilPage.setText("TXT_ZIP", "560076");
    	PinnacleUtilPage.setText("TXT_PHONE", "987564321");
    	PinnacleUtilPage.setText("TXT_EMAIL", "abhik01.khandelwal@gmail.com");
    	PinnacleUtilPage.setText("TXT_OPC_PROMO_CODE","00001111");
    	PinnacleUtilPage.click("BTN_APPLY_PROMO_CODE");
    	PinnacleUtilPage.sleep(5);
    	logger.info("Added an item with promo code");
	}
    /**
     * Check Discounted Amount
     */
    
    public void Check_Discounted_Amount()
	{
    	//Check Discounted Amount
		String Subtotal,Discount,Total;
		double subtotal,discount,total,calculatedtotal;
		
		Subtotal=PinnacleUtilPage.getObject("LABEL_SUBTOTAL_PRICE").getText();
		Discount=PinnacleUtilPage.getObject("LABEL_PROMO_PRICE").getText();
		Total=PinnacleUtilPage.getObject("LABEL_INVOICE_TOTAL").getText();
		Subtotal=Subtotal.replace(",","");
		Total=Total.replace(",","");
		subtotal=Double.parseDouble(Subtotal.substring(1));
		discount=Double.parseDouble(Discount.substring(2));
		total=Double.parseDouble(Total.substring(1));
		calculatedtotal=(subtotal-discount);
		if(calculatedtotal == total)
		{
			Assert.assertTrue("Discounted amount is not correct", true);
			logger.info("Discounted amount is correct");
		}
		else
		{
			Assert.assertTrue("Discounted amount is not correct", false);
		}
		PinnacleUtilPage.click("RAD_USE_THIS_SHIP_ADDRESS");
		PinnacleUtilPage.sleep(5);
		PinnacleUtilPage.click("BTN_CONTINUE_ORDER");
    	PinnacleUtilPage.sleep(5);
	}
}
