package stepDefenations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonStepDef {
	WebDriver driver;
	public AmazonStepDef() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/amith/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() {
	   driver.get("http://www.amazon.com");
	}

	@When("^user search for \"([^\"]*)\"$")
	public void user_search_for(String arg1) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(arg1);
	}

	@When("^click on search button$")
	public void click_on_search_button() {
	    driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).submit();	
	}

	@Then("^results should appear for \"([^\"]*)\"$")
	public void results_should_appear(String text) {
		int count = driver.findElements(By.partialLinkText(text)).size();
		Assert.assertTrue(count>0);
		driver.findElement(By.id("twotabsearchtextbox")).clear();
	}


}
