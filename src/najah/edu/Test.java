package najah.edu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class Test {
	static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.setProperty("webdriver.gocko.driver", "C:\\Users\\Horizon\\Downloads\\geckodriver.exe");
		driver=new FireFoxDriver();
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@org.junit.jupiter.api.Test
	void test() {
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		((WebElement) driver.findElements(By.xpath(".//* [@id='u_0_q']"))).sendKeys("req_email__");
		((WebElement) driver.findElements(By.xpath(".//* [@id='u_0_x']"))).sendKeys("reg_passwd__");
		((WebElement) driver.findElements(By.xpath(".//* [@id='u_0_13']"))).click();
	}

}
