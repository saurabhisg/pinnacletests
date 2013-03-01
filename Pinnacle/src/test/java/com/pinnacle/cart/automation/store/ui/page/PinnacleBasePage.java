package com.pinnacle.cart.automation.store.ui.page;


import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pinnacle.cart.automation.store.api.impl.PinnacleStoreApiUI;


public class PinnacleBasePage {

	public static WebDriver driver;
	final  static Logger logger = LoggerFactory.getLogger(PinnacleStoreApiUI.class.getName());
	public static Properties Orproperty = null;
	public static Properties initproperty = null;
	public static PinnacleUtilPage putil=new PinnacleUtilPage();
	public static String Vocher_Number=null;
	private String seleniumUrl;
	private String applicationUrl;
	private String browser;
	private String applicationScreenMappingFile;
	
	
	public PinnacleBasePage(WebDriver driver, String browser, String seleniumUrl, String applicationUrl, String applicationScreenMappingFile,Properties Orproperty,Properties initproperty)
	{
		this.browser = browser;
		this.seleniumUrl = seleniumUrl;
		this.applicationUrl = applicationUrl;
		this.applicationScreenMappingFile = applicationScreenMappingFile;
		this.driver=driver;
		this.Orproperty=Orproperty;
		this.initproperty=initproperty;
		logger.info("Selenium Server: " + this.seleniumUrl);
		logger.info("Application Url: " + this.applicationUrl);
	}
	
	public PinnacleBasePage()
	{
	}
}