package Page.Object;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class AHomePage {
	
	WebDriver driver;
    private By btn_close= By.xpath("/html/body/div[1]/div[4]/div/section/button");
    private By btn_connexion= By.xpath("//*[@id=\"jm\"]/header/section/div[2]/div[1]/label");
    private By btn_compte= By.xpath("//*[@id=\"dpdw-login-box\"]/div/div/a");
   

	public AHomePage(WebDriver driver) {
		this.driver=driver;
	}

	public By getbtn_closer_close() {
		return btn_close;
	}

	public By getBtn_connexion() {
		return btn_connexion;
	}

	public By getBtn_compteBy() {
		return btn_compte;
	}

	public void newsLetter_close() {
	 driver.findElement(btn_close).click();
	}

	public void clickOnSeConnecter() {
		 driver.findElement(btn_connexion).click();
		
	}

	public void clickOnVotreCompte() {
		driver.findElement(btn_compte).click();
		
	}
	
	

	

	
}
