package com.saucedemo.testbase;


import com.saucedemo.propertyreader.PropertyReader;
import com.saucedemo.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("broswer");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

}
