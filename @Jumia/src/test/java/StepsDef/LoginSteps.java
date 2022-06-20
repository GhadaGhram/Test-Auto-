package StepsDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Page.Object.AHomePage;
import Page.Object.BEmailPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
			
			WebDriver driver=null;
			AHomePage pageAcceuil;
			BEmailPage email;
			//code class page
			//declaration des vars une clase a part ou bien dans la classe page en haut 
			
			@Given("browser is open")
			public void browser_is_open() {
				
					System.out.println("Inside Step - browser is open");		
					String projectPath = System.getProperty("user.dir");
					System.out.println("Project path is : "+projectPath);			
				    System.setProperty("webdriver.edge.driver", projectPath+"/src/test/resources/drivers/msedgedriver.exe");
							   
					driver = new EdgeDriver();
					driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
					driver.manage().window().maximize();				
			}

			@And("user is on login page")
			public void user_is_on_login_page() throws InterruptedException {
			    	driver.navigate().to("https://www.jumia.com.tn/");
				    Thread.sleep(2000);	
				    AHomePage pageAcceuil=new AHomePage(driver);
				    pageAcceuil.newsLetter_close();
				    
				    pageAcceuil.clickOnSeConnecter();
				    pageAcceuil.clickOnVotreCompte();
			}

			@When("^user enters(.*)and clicks on continue$")
			public void user_enters_ghadaa_ghram_gmail_com_and_clicks_on_continue(String arg1) throws InterruptedException {
				
				BEmailPage email = new BEmailPage(driver);
				String username = null;
				email.enterEmail(username);
				Thread.sleep(2000);
			   // email.clickOnContinue();
				
			  
			}

			@And("^user enters (.*) and clicks on continue$")
			public void user_enters_Gh11046090_and_clicks_on_continue() {
				driver.findElement(By.xpath("//*[@id=\\\"pop\\\"]/div/section/button")).click(); 
			}

			@Then("user is navigated to the home page")
			public void user_is_navigated_to_the_home_page() {
				driver.findElement(By.xpath("//*[@id=\\\"pop\\\"]/div/section/button")).click(); 
			}};



