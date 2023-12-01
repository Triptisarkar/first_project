package Stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepdefclass {
	WebDriver driver;
	@Given("^Open demoblaze application$")
	public void open_demoblaze_application() throws Throwable {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\tript\\eclipse-workspace\\first_practice1\\chrome_driver\\chrome.exe");
		ChromeOptions happy = new ChromeOptions();
			happy.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver();
			driver.get("https://www.demoblaze.com/");
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
	}

	@Then("^Click login$")
	public void click_login() throws Throwable {
		
		WebElement ab = driver.findElement(By.id("login2"));
	ab.click();
	}

	@Then("^Enter username$")
	public void enter_username() throws Throwable {
	  WebElement ad = driver.findElement(By.id("loginusername"));
	  ad.sendKeys("tripti2");
	}

	@Then("^Enter password$")
	public void enter_password() throws Throwable {
	 WebElement af = driver.findElement(By.id("loginpassword"));
	 af.sendKeys("12345");
	}

	@Then("^Verify user can login$")
	public void verify_user_can_login() throws Throwable {
	   WebElement ag = driver.findElement(By.xpath("//button[@onclick='logIn()']"));
	   ag.click();
	   
	   boolean tom = driver.findElement(By.id("login2")).isDisplayed();
	Assert.assertTrue(tom);
	}

	@Then("^click cart link$")
	public void click_cart_link() throws Throwable {
	    WebElement oi = driver.findElement(By.id("cartur"));
	    oi.click();
	    boolean pot=driver.findElement(By.xpath("//button[text()='Place Order']")).isDisplayed();
	Assert.assertTrue(pot);
	}

}
