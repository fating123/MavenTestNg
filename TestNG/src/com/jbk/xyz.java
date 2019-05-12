package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class xyz {
	WebDriver driver = null;
	
	@BeforeClass
	public void setenv(){
	
	driver=new FirefoxDriver();	
	driver.get("file:///C:/Users/pawan/Desktop/Selenium%20Software/Offline%20Website/index.html");
		
	}
	
	@Test(priority=0)
	public void dologin(){
		String ActTitle= driver.getTitle();
		String ExpTitle= "AdminLTE 2 | Log in";
		Assert.assertEquals(ActTitle, ExpTitle);
	}
	
	@Test(priority=1)
	public void Label(){
		String ActLabel=driver.findElement(By.xpath("html/body/div[1]/div[1]/a")).getText();
		String ExpLabel ="AdminLTE";
		Assert.assertEquals(ActLabel, ExpLabel);
	}
	@Test(priority=2)
	public void Headline(){
		String ActHeadline=driver.findElement(By.xpath("html/body/div[1]/div[2]/p")).getText();
		String ExpHeadline="Sign in to start your session";
		Assert.assertEquals(ActHeadline, ExpHeadline);
	}
	
	@Test(priority=3)
	public void Button(){
		String ActButton= driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button")).getText();
		String ExpButton= "Sign In";
		Assert.assertEquals(ActButton, ExpButton);
		
	}
	
	@Test(priority=4)
	public void Headlabel1(){
		String ActLabel1=driver.findElement(By.xpath("html/body/div[1]/div[2]/a")).getText();
		String ExpLabel1="Register a new membership";
		Assert.assertEquals(ActLabel1, ExpLabel1);
	}
	
	@Test(priority=5)
	public void blanklogin(){
		
		WebElement username=driver.findElement(By.id("email"));
		username.clear();
		username.sendKeys("");
		WebElement password=driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("");
		WebElement button=driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
		button.click();
	}
	
	@Test(priority=6)
	public void invalidlogin(){
		
		WebElement username=driver.findElement(By.id("email"));
		username.clear();
		username.sendKeys("kiran34@gmail.com");
		WebElement password=driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("123456");
		WebElement button=driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
		button.click();
	}
	@Test(priority=7)
	public void validlogin(){
		
		WebElement username1=driver.findElement(By.id("email"));
		username1.sendKeys("kiran@gmail.com");
		WebElement password1=driver.findElement(By.id("password"));
		password1.sendKeys("123456");
		WebElement button=driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
		button.click();
	}
	
	@Test(priority=8)
	public void DashboardTitle(){
		String ActDashboard=driver.getTitle();
		String ExpDashboard="AdminLTE 2 | Log in";
		Assert.assertEquals(ActDashboard, ExpDashboard);
	}
	
	@Test(priority=9)
	public void Dashboard(){
		String ActDashboard=driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[2]/a/span")).getText();
		System.out.println(ActDashboard);
		String ExpDashboard="Dashboard";
		Assert.assertEquals(ActDashboard, ExpDashboard);
	}
	
	@Test(priority=10)
	public void Users(){
		String ActUsers=driver.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a/span")).getText();
		String ExpUsers="Users";
		Assert.assertEquals(ActUsers, ExpUsers);
	}
	
	@Test(priority=11)
	public void Operators(){
		String ActOperators=driver.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[4]/a/span")).getText();
		String ExpOperators="Operators";
		Assert.assertEquals(ActOperators, ExpOperators);
	}
	
	@Test(priority=12)
	public void Logout(){
		String ActLogout=driver.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[5]/a/span")).getText();
		String ExpLogout="Logout";
		Assert.assertEquals(ActLogout, ExpLogout);
	}
	
	@Test(priority=13)
	public void Logout1(){
		String ActLogout1=driver.findElement(By.xpath("html/body/div[1]/header/nav/div/ul/li/a")).getText();
		String ExpLogout1="LOGOUT";
		Assert.assertEquals(ActLogout1, ExpLogout1);
	}
	
	@Test(priority=14)
	public void UsersTitle(){
		WebElement button=driver.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a"));
		button.click();
		String ActUsersTitle=driver.getTitle();
		String ExpUsersTitle="AdminLTE 2 | User";
		Assert.assertEquals(ActUsersTitle, ExpUsersTitle);
	}
	
	@Test(priority=15)
	public void OperatorsTitle(){
		WebElement button1=driver.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[4]/a"));
		button1.click();
		String ActOperatorsTitle=driver.getTitle();
		String ExpOperatorsTitle="AdminLTE 2 | Operators";
		Assert.assertEquals(ActOperatorsTitle, ExpOperatorsTitle);
	}
	
	@Test(priority=16)
	public void LogoutTitle(){
		WebElement button2=driver.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[5]/a"));
		button2.click();
		String ActLogoutTitle=driver.getTitle();
		String ExpLogoutTitle="AdminLTE 2 | Log in";
		Assert.assertEquals(ActLogoutTitle, ExpLogoutTitle);
	}
	
	
	@AfterClass
	public void closebrowser(){
		driver.quit();
		
	}
}
