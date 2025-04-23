
//import java.util.Scanner;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RQM  {
    public static void main(String[] args) throws InterruptedException {
    		FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.addPreference("network.proxy.type", 2);
            firefoxOptions.addPreference("network.proxy.autoconfig_url", "http://vf-corporate-it.vodafone.com:8080/proxy.pac");
            firefoxOptions.addPreference("network.proxy.no_proxies_on","localhost,jazztestserver.ibmvdf.it,jazzteamserver.ibmvdf.it,mino.muro.test,abbonamenti.vodafone.it,screenshots.firefox.com,contrib-fe-v1.pre3.vfit.picasso.vodafone.it,backoffice.vodafone.it,backoffice.onmitel.it,www.vodafone.it,sbloccosoglia.vodafone.it,bilancio.vodafone.it,exch.vodafone.it,iao.vodafone.it,registrazione.vodafone.it,secure.vodafone.it,vfast.vodafone.it,www.areaaziende.vodafone.it,i2.vfimg.it,www.areaprivati.vodafone.it,www.comunicazione.vodafone.it,s.vfimg.it,i4.vfimg.it,www.lavoraconnoi.vodafone.it,www.shop.vodafone.it,i1.vfimg.it,i3.vfimg.it,www.vodafonedsl.it,wap.vodafone.it,webservices.omnitel.it,dite.vodafone.it,igp.vodafone.it,sso.vodafone.it,widget.vodafone.it,omhw787.omnitel.it,fdtpridsl.omnitel.it,FdTPRISMS.omnitel.it,sbloccosoglia.vodafone.it,login.vodafone.it,www.centralino.vodafone.it,report-download.vodafone.it, fyo.vodafone.it,downloadbo.vodafone.it,it1-wlp001.pre4.vfit.picasso.vodafone.com:15710");
            FirefoxDriver driver = new FirefoxDriver(firefoxOptions);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.manage().window().maximize();
            String url = "https://jazzteamserver.ibmvdf.it:9443/ccm/web/projects/AD&M2.1%20CCM#action=com.ibm.team.dashboard.viewDashboard";
            driver.get(url);
            
            driver.findElement(By.cssSelector("input[id*='userId']")).sendKeys("akrsana");
            driver.findElement(By.cssSelector("input[id*='pass']")).sendKeys("IbmIndia555!");
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            Actions action = new Actions(driver);
            
            
            
        	int[] ar = {443185};
        	for(int r=0; r<ar.length; r++) {
        	String tt = "https://jazzteamserver.ibmvdf.it:9443/ccm/web/projects/AD&M2.1%20CCM#action=com.ibm.team.workitem.newWorkItem&type=cm_deploy&ts=17377168836800";
        	driver.switchTo().newWindow(WindowType.TAB);
        	driver.get(tt);
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        	WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[title='Links']")));
        	link.click();
        	//driver.findElement(By.cssSelector("a[title='Links']")).click();
        	driver.findElement(By.cssSelector("span[class='DropdownElement']")).click();
        	driver.findElement(By.className("QueryInput")).sendKeys(String.valueOf(ar[r]));
        	WebElement we = driver.findElement(By.className("QueryResults"));
        	Select select = new Select(we);
        	select.selectByIndex(0);
        	driver.findElement(By.xpath("//button[@dojoattachpoint='okCmd']")).click();
        	driver.findElement(By.xpath("//button[@class='primary-button']")).click();
        	driver.findElement(By.xpath("//a[@title='Overview']")).click();
////        	need to click overview tab
////        	left column
//            // the below line is for searching an ticket
////            driver.findElement(By.xpath("//input[@class='SearchInputText']")).sendKeys("442732");
//            
            Thread.sleep(20000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("TitleText")));
        	driver.findElement(By.id("com_ibm_team_workitem_web_mvvm_view_queryable_combo_QueryableComboView_1")).click();
//        	//driver.findElement(By.id("com_ibm_team_workitem_web_mvvm_view_queryable_combo_QueryableSection_QueryableElement_2131"));
        	action.keyDown(Keys.ARROW_DOWN).perform();
        	action.keyDown(Keys.ENTER).perform();
        	driver.findElement(By.id("com_ibm_team_workitem_web_mvvm_view_queryable_combo_QueryableComboView_2")).click();
        	Thread.sleep(2000);
//        	//planned for
        	driver.findElement(By.cssSelector("div.com-ibm-team-workitem-web-ui-internal-view-editor-mvvm-views-QueryableComboView-DropDown:nth-child(18) > div:nth-child(1) > input")).sendKeys("202505");
        	Thread.sleep(2000);
        	action.keyDown(Keys.ENTER).perform();
        	driver.findElement(By.id("com_ibm_team_workitem_web_mvvm_view_queryable_combo_QueryableComboView_4")).click();
        	driver.findElement(By.id("com_ibm_team_workitem_web_mvvm_view_queryable_combo_QueryableSection_QueryableElement_3")).click();
        	WebElement we1 = driver.findElement(By.className("Select"));
        	select.selectByIndex(2);
        	//save option
        	driver.findElement(By.className(".primary-button")).click();
        	String deployNumber = driver.findElement(By.className("TitleText")).getText();
        	String summary = driver.findElement(By.id("com_ibm_team_workitem_web_mvvm_view_editor_RichTextEditorView_0")).getText();
        	System.out.println(deployNumber + " : " + summary);
        }
    }
}
