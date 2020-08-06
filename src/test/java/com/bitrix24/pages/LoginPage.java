package com.bitrix24.pages;

import com.bitrix24.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.apache.log4j.Logger;



public class LoginPage extends BasePage {
    private final static Logger logger =Logger.getLogger(LoginPage.class);

    @FindBy(name = "USER_LOGIN")
    private WebElement username;

    @FindBy(name = "USER_PASSWORD")
    private WebElement password;


    public void Login(){


        String usernameString = ConfigurationReader.getProperty("username");
        String passwordString = ConfigurationReader.getProperty("password");

        username.sendKeys(usernameString);
        password.sendKeys(passwordString, Keys.ENTER);

        //Don't print password at work
        logger.info("Login with "+usernameString+" and username "+passwordString+" and password");

       // System.out.println("Login with "+usernameString+" and username "+passwordString+" and password");
    }
}
