import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

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
	driver.get("https://www.amazon.in/");
	
	}
@When("User searches for Laptop")
public void SearchLaptop() {
	driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]")).sendKeys("Laptop");
	driver.findElement(By.xpath("//input[contains(@id,'nav-search-submit-button')]")).click();
	driver.close();
}
@Then("Select laptop")
public void MoveToCart() {
	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	//driver.getWindowHandle()
	driver.switchTo().defaultContent();


}
}
