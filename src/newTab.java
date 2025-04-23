import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class newTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 FirefoxDriver driver = new FirefoxDriver();
	 driver.executeScript("window.open('');");
	 driver.executeScript("window.open('');");
	 driver.executeScript("window.open('');");
     

	}

}
