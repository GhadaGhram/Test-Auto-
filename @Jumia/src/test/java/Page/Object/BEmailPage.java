package Page.Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BEmailPage {
	protected WebDriver driver;
	private By txt_email=By.xpath("/html/body/div/div[4]/form/div[2]/div[2]/label/input");
	private By btn_Continue=By.className("mdc-button__touch");
	
    public BEmailPage(WebDriver driver) {
				this.driver = driver;
		
	}

	public By getTxt_email() {
		return txt_email;
	}
	public void setTxt_email(By txt_email) {
		this.txt_email = txt_email;
	}
	public By getBtn_Continue() {
		return btn_Continue;
	}
	public void setBtn_Continue(By btn_Continue) {
		this.btn_Continue = btn_Continue;
	}
	
	public void enterEmail(String userEmail) {
		driver.findElement(txt_email).sendKeys(userEmail);
	}
	
	public void clickOnContinue() {
		driver.findElement(btn_Continue).click();
		
	}
	
	

}