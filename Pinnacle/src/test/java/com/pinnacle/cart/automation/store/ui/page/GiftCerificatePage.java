package com.pinnacle.cart.automation.store.ui.page;




import org.openqa.selenium.By;

public class GiftCerificatePage extends PinnacleBasePage{
	

	
	
	/**
	 *Click on Gift Certificates Settings and click the Enable Module button
	 */
	
	public void Click_On_Gift_Certificate_Settings_And_Click_Enable_Module()
	{
		
		//Click on Gift Certificates Settings and click the Enable Module button
		PinnacleUtilPage.sleep(10);
		PinnacleUtilPage.click("LNK_GIFT_CERTIFICATE_SETTINGS");
		PinnacleUtilPage.click("BTN_ENABLE_MODULE");
		PinnacleUtilPage.sleep(3);
		logger.info("Enabled module button");
		
	}
	
	/**
	 * Click the Gift Certificates link
	 */
	
	public void Click_Gift_Certificate_Link()
	{
		//Click the Gift Certificates link
		PinnacleUtilPage.click("LNK_HOMEPAGE_GIFT_CERTIFICATE");
		logger.info("clicked on gift certificate link");

	}
	
	/**
	 *Fill the form and click Add To Cart
	 */
	
	public void Fill_Form_And_Click_Add_Cart()
	{
		//Fill the form and click Add To Cart
		PinnacleUtilPage.setText("TXT_G_FIRSTNAME", "Abhik");
		PinnacleUtilPage.setText("TXT_G_LASTNAME", "Khandelwal");
		PinnacleUtilPage.setText("TXT_G_PHONE", "987564321");
		PinnacleUtilPage.setText("TXT_G_EMAIL", "abhik01.khandelwal@gmail.com");
		PinnacleUtilPage.setText("TXT_G_NAME", "Abhik");
		PinnacleUtilPage.setText("TXT_G_CERTIFICATE_NAME", "ABCD");
		driver.findElement(By.xpath(Orproperty.getProperty("TXT_G_PRICE"))).clear();
	    PinnacleUtilPage.setText("TXT_G_PRICE", "1.0");
    	PinnacleUtilPage.click("BTN_G_ADD_CART");
    	PinnacleUtilPage.sleep(5);
    	logger.info("Filled the form and clicked on add cart button");
    	
	}
	
	public void Retrieve_Voucher_Code()
	{
		PinnacleUtilPage.sleep(5);
		Vocher_Number=PinnacleUtilPage.getObject("LABEL_VOUCHER_NUMBER").getText();
	}
	
}
