package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common_methods.validations;

public class logout_page {
	public static final By ProfileDrpDwnBtnBy=By.xpath("//div[@id='loginSection']");

	public static final By ProfileDrpDwnListVdtBy=By.xpath("//ul[@id='drop1']");

	public static final By LogoutButtonBy=By.xpath("//a[text()='Logout']");

	

	//web Element

	static WebElement ProfileDrpDwnBtn() {



    	return Basepage.getDriver().findElement(ProfileDrpDwnBtnBy);



    }

	static WebElement ProfileDrpDwnListVdt() {

		return Basepage.getDriver().findElement(ProfileDrpDwnBtnBy);

		

	}



    static WebElement LogoutButton()



    {

    return Basepage.getDriver().findElement(LogoutButtonBy);



    }

	

	

	//action

	public static void clickProfiledrpDown() throws Exception

	{

		

	Thread.sleep(5000);

	ProfileDrpDwnBtn().click();

	Thread.sleep(5000);

	}

	

	public static void profileDrpDwnListDisplayed() throws Exception {

		

		validations.IsDsiplayed(ProfileDrpDwnListVdt(), "profile dropdown list is not displayed");

	}

	

	public static void LogoutBtn() throws Exception {	

	Thread.sleep(5000);

	LogoutButton().click();

	Thread.sleep(5000);



	}

}
