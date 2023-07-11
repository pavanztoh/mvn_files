package com.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basepage {
	

public static WebDriver driver;

	

//To instantiate driver

	public static void  driverIn() throws Exception {

	     driver = new ChromeDriver();

	     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	    // properties_fileRead();

		//driver.get(p.getProperty("baseurl"));

		//Thread.sleep(3000);

		driver.manage().window().maximize();
		driver.get(constants.HomePageUrl);

		

	}

	

	

	//to get driver

	public static WebDriver getDriver() {

		

		return driver;

	}


	

	// To quit the browser

		public static void 	quit() {

			driver.quit();

		}

	public static FileInputStream fi;

	public static Properties p;

	

	

	public static void properties_fileRead() throws IOException {

		

		fi=new FileInputStream("D:\\GitPractice_Workspace\\cucumber_repository\\cuccumber_project_files\\src\\main\\resources\\file.properties");

		p= new Properties();

		p.load(fi);

		fi.close();

		

	}

	

	public static String Uername() throws IOException {

		return p.getProperty("username");

		

	}

	

	public static String paswd() throws IOException {

		return p.getProperty("Password");

		

	}


}




	
	
	


