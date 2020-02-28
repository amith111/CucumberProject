/*
 * package stepDefenations;
 * 
 * import org.junit.Assert; import org.openqa.selenium.By; import
 * org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import cucumber.api.java.en.Given; import cucumber.api.java.en.Then; import
 * cucumber.api.java.en.When;
 * 
 * public class searchStepDefenation {
 * 
 * WebDriver driver;
 * 
 * @Given("^User is already  on Amazon.com$") public void
 * user_is_already_on_Amazon() { System.setProperty("webdriver.chrome.driver",
 * "C:/Users/amith/Downloads/chromedriver_win32/chromedriver.exe"); driver = new
 * ChromeDriver(); driver.get("https://www.amazon.com/"); }
 * 
 * @When("^title of the page is Amazon.com$") public void
 * title_of_the_age_is_Amazon() { String title = driver.getTitle();
 * System.out.println(title); Assert.assertEquals("https://www.amazon.com/",
 * title);
 * 
 * 
 * }
 * 
 * 
 * @Then("^User click on the search box and  search for Software Devlopment$")
 * public void user_click_on_the_search_box_and_search_for_Software_Devlopment()
 * {
 * 
 * 
 * driver.findElement(By.id("twotabsearchtextbox")).
 * sendKeys("Software Devlopment");
 * 
 * }
 * 
 * @Then("^User search click the seach icon$") public void
 * user_search_click_the_seach_icon() {
 * 
 * driver.findElement(By.id("nav-search-submit-text")).click(); }
 * 
 * 
 * }
 */