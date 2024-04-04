import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
@Test

public class TestSearch extends BaseTest {
WebDriver driver;

@Given("User is on Amazon homepage")
	public void AmazonHomePage() {
	setup();
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	
	}
@When("User searches for Laptop")
public void SearchLaptop() {
	driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]")).sendKeys("Laptop");
	driver.findElement(By.xpath("//input[contains(@id,'nav-search-submit-button')]")).click();
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0, 600)");
}
	 
	 @When("Search for the element" )
			public void ClickOnElemt() {
		 //JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		// js.executeScript("arguments[0].click();", "//h2[@class=\"a-size-mini a-spacing-none a-color-base s-line-clamp-2\"])[2]");
			//driver.findElement(By.xpath("(//a[contains(@class,'l s-underline-text s-underline-link-text s-link-style a-text-normal')])[2]")).click();		
			driver.findElement(By.xpath("(//div[contains(@class,'a-section a-spacing-none puis-padding-right-small s-title-instructions-style')])[2]")).click();
			 
			
}
	

/*
@Then("Select laptop")
public void MoveToCart() {
	
	for (String windowHandle : driver.getWindowHandles()) {
           if (!windowHandle.equals(windowHandle)) {
                driver.switchTo().window(windowHandle);
               break;
            }
        }
driver.findElement(By.xpath("(//*[@title='Add to Shopping Cart'])[2]")).click();
driver.close();*/

}


