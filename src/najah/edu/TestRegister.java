package najah.edu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestRegister {
static WebDriver driver;
public static void main(String ar[]) {
	//nessacry befor create object of fireFox
	System.setProperty("webdriver.gocko.driver", "C:\\Users\\Horizon\\Downloads\\geckodriver.exe");
	driver=new FireFoxDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	((WebElement) driver.findElements(By.xpath(".//* [@id='u_0_l']"))).sendKeys("firstname");
	Select sel=new Select((WebElement) driver.findElements(By.xpath(".//* [@id='month']")));
	sel.selectByIndex(3);
	((WebElement) driver.findElements(By.xpath(".//* [@id='u_0_13']"))).click();
	driver.navigate().back();
	driver.quit();
}
}
