import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationexercise.com");
		String home = driver.findElement(By.xpath("//a[contains(@style,'color: orange;')]")).getText();
		//Home page
		Assert.assertEquals(home, "Home");
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[2]")).click();

	}

}
