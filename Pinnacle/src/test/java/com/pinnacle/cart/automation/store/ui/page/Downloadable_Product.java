package com.pinnacle.cart.automation.store.ui.page;

import java.io.IOException;



public class Downloadable_Product extends PinnacleBasePage{

String strUploadAutoIT = System.getProperty("user.dir")+"\\autoit\\upload.exe";

	
	
	/**
	 * Create a product for the downloadable product
	 * @throws IOException
	 */

	public void Create_Product_For_Downloadble_Product() throws IOException 
	{
		//Create a product for the downloadable product
		PinnacleUtilPage.setText("TXT_PRODUCT_NAME", "Samsung Tab");
		PinnacleUtilPage.setText("TXT_PRODUCT_ID", "Test01");
		PinnacleUtilPage.setText("TXT_ITEM_PRICE", "200");
		putil.selectValueInDropDown("SELCT_MAIN_CATEGORY","Tablets");
		PinnacleUtilPage.click("TXT_IMAGE");
		putil.uploadFile(strUploadAutoIT, "File Upload", System.getProperty("user.dir")+"\\images\\tablet.jpg");
		PinnacleUtilPage.sleep(3);
		logger.info("Created a product for the downloadable product");
	}
	
	/**
	 * Expand Digital Product Properties
	 */
	
	public void Expand_Digital_Product_Properties()
	{
		//Expand Digital Product Properties
		PinnacleUtilPage.click("LNK_DIGITAL_PRODUCT_PROPERTIES");
		logger.info("Expanded Digital Product Properties");
	}
	
	/**
	 * Check the checkbox for Is this a digital download
	 */
	public void Check_checkbox_for_digital_download()
	{
		//Check the checkbox for Is this a digital download
		PinnacleUtilPage.click("CHK_DIGITAL_PRODUCT");
		logger.info("Checked the checkbox for Is this a digital download");
	}

	/**
	 * provide a path for the digital download file and click Save Changes
	 */

	public void Path_For_Digital_Download_File_And_Save_Changes()
	{
		//provide a path for the digital download file and click Save Changes
		PinnacleUtilPage.setText("TXT_PATH_DIGITAL_FILE", System.getProperty("user.dir")+"\\digital.txt");
		PinnacleUtilPage.click("BTN_PRODUCT_SAVE_CHANGES");
		logger.info("provided a path for the digital download file and click Save Changes");
	}
	
	
	
}
