package BrowserStackPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AHomePage {
	protected WebDriver driver;
	
	private By btn_login=By.className("ic -mls -fsh0");
	private By btn_account=By.className("btn _prim -fw _md");
	private By btn_block=By.className("cls");
	private By bar_recherche=By.name("q");
	private By btn_rechercher=By.className("btn _prim _md -mls -fsh0");
	
	public AHomePage(WebDriver driver) {
		
		this.driver = driver;	
		if(!driver.getTitle().equals("Jumia Tunisie")) {
			throw new IllegalStateException("This is not Login Page. The Current page is "
			+driver.getCurrentUrl());
		}
	}
	
	public By getBtn_login() {
		return btn_login;
	}
	public void setBtn_login(By btn_login) {
		this.btn_login = btn_login;
	}
	public By getBtn_account() {
		return btn_account;
	}
	public void setBtn_account(By btn_account) {
		this.btn_account = btn_account;
	}

	public void clickOnSeConnecter() {
		driver.findElement(btn_login).click();
		
	}

	public void clickOnSeCONNECTER() {
		driver.findElement(btn_account).click();
		
	}

	public By getBtn_block() {
		return btn_block;
	}

	public void setBtn_block(By btn_block) {
		this.btn_block = btn_block;
	}

    public void adBlock() {
    	driver.findElement(btn_account).click();
    }

	public By getBar_recherche() {
		return bar_recherche;
	}

	public void setBar_recherche(By bar_recherche) {
		this.bar_recherche = bar_recherche;
	}

	public void recherche(String article) {
		driver.findElement(bar_recherche).sendKeys(article);
		
		driver.findElement(btn_rechercher).sendKeys(Keys.ENTER);
		
	}
}
