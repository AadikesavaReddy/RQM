import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\AdikesavaReddySanapa\\Downloads\\chromedriver-win64");
		//WebDriver driver  = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationexercise.com");
		String linkText = driver.findElement(By.xpath("//a[contains(@style, 'color: orange;')]")).getText();
		
		if(linkText.equals("Home")) {
			System.out.println("Home Page is Visisble");
		}
		driver.findElement(By.xpath("//ul/li[4]")).click();
		String linkText2 = driver.findElement(By.xpath("//div[3]//h2")).getText();
		if(linkText2.equals("New User Signup!"))
			System.out.println("Signup is Visisble");
		driver.findElement(By.name("name")).sendKeys("Aadi");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("adikesava403@mail.com");
		driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
		String linkText3 = driver.findElement(By.className("title text-center")).getText();
		if(linkText3.equals("Enter Account Information"))
			System.out.println("Enter Account Information is Visisble");
		driver.close();

	}

}
