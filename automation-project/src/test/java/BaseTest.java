import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {
	public static void setup() {
		String chromeDriverPath="C:\\Users\\SAKSHI RAJ\\git\\Project\\automation-project\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"; 
   System.setProperty("webdriver.chrome.driver", chromeDriverPath);
	//WebDriver driver = new ChromeDriver();
	//driver.manage().window().maximize();
	//driver.get("https://www.amazon.in/");
	
	//driver.close();
	} 

}
