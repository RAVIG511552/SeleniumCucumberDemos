package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Checklogin{
		WebDriver driver;
		
		
			@Given("^Open chrome and start the application$")
			public void open_chrome_and_start_the_application() {
				  System.setProperty("webdriver.chrome.driver", "E:\\Jarfiles\\chromedriver.exe");
				  driver=new ChromeDriver();
				  driver.get("http://demowebshop.tricentis.com/login");
				  driver.manage().window().maximize();
			}
		
			@When("^I provide valid username and password$")
			public void i_provide_valid_username_and_password() {
				driver.findElement(By.id("Email")).sendKeys("naniravi4664@gmail.com");
				driver.findElement(By.name("Password")).sendKeys("pwd@123");
			}
		
			@Then("^user should be able to login$")
			public void user_should_be_able_to_login() {
				driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
			}
}
