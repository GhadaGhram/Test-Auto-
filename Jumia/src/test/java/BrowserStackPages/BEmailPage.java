package BrowserStackPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BEmailPage {
	protected WebDriver driver;
	private By txt_email=By.name("email");
	private By btn_Continue=By.className("mdc-button__touch");
	
    public BEmailPage(WebDriver driver) {
		
		this.driver = driver;
		if(!driver.getTitle().equals("My Jumia")) {		
		throw new IllegalStateException("This is not Login Page. The Current page is "
		+driver.getCurrentUrl());
	}
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
