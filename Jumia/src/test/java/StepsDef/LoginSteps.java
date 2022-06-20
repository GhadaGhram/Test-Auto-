package StepsDef;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BrowserStackPages.AHomePage;
import BrowserStackPages.BEmailPage;
import BrowserStackPages.CPasswordPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver = null;
	AHomePage home;
	BEmailPage email;
	CPasswordPage Motdepasse;
	
	
	@Given("browser is open")
	public void browser_is_open() {
        System.out.println("  ===  I am inside LoginSteps_PF class ===== ");
		System.out.println("Inside Step - browser is open");		
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);		
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    
	}

	@And("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
				
			driver.navigate().to("https://www.jumia.com.tn/cart/");
			//driver.findElement(By.className("nl-fi")).sendKeys("alice@gmail.com");
			//driver.findElement(By.className("nl-btn btn _prim _md -fw")).sendKeys(Keys.ENTER);
			//home.adBlock();
			//Thread.sleep(40);
			
			//home=new AHomePage(driver);	
			//home.clickOnSeConnecter();
			//home.clickOnSeCONNECTER();
			home.recherche("ecran");
			
			
	}

	@When("^user enters (.*) and clicks on continue$")
	public void user_enters_email_and_clicks_on_continue() {
        
		email=new BEmailPage(driver);
		String username = null;
		email.enterEmail(username);
	    email.clickOnContinue();
		

	}

	@And("^user enters (.*)and clicks on continue$")
	public void user_enters_password_and_clicks_on_continue() {
	   
		Motdepasse=new CPasswordPage(driver);
		String password = null;
		Motdepasse.enterPassword(password);
	    Motdepasse.clickOnSeconnecter2();
		
	    
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	   
	 
	}


}
