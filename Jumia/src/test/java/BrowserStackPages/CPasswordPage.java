package BrowserStackPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CPasswordPage {
	protected WebDriver driver;
	private By txt_password=By.name("password");
	private By btn_connexion=By.className("mdc-button__touch");
	
	public CPasswordPage(WebDriver driver) {
		
		this.driver = driver;
		if(!driver.getTitle().equals("My Jumia")) {
		throw new IllegalStateException("This is not Login Page. The Current page is "
			+driver.getCurrentUrl());
		}
	}

	public By getTxt_password() {
		return txt_password;
	}

	public void setTxt_password(By txt_password) {
		this.txt_password = txt_password;
	}

	public By getBtn_connxion() {
		return btn_connexion;
	}

	public void setBtn_connxion(By btn_connxion) {
		this.btn_connexion = btn_connxion;
	}

	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
		
	}

	public void clickOnSeconnecter2() {
		driver.findElement(btn_connexion).click();
		
	}

	
	
	
}
