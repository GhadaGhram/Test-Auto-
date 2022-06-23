package Page.Object;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import driver.Driver;

public class CreationPageObject extends Driver{
	WebDriver driver;
	
	//<Déclaration des variables>
	//PageObject homepage
    private By btn_close= By.xpath("//*[@id=\"pop\"]/div/section/button");
    private By btn_seconnecter1=By.xpath("//*[@id=\"jm\"]/header/section/div[2]/div[1]/label");
    private By btn_seconnecter2= By.xpath("//*[@id=\"dpdw-login-box\"]/div/div/a");
    private By txt_email=By.xpath("/html/body/div/div[4]/form/div[2]/div[2]/label/input");
    private By btn_continuer1=By.xpath("/html/body/div/div[4]/form/div[2]/div[3]/div/button");
    private By txt_password=By.xpath("//*[@id=\"card_password\"]/div[3]/label/input");
    private By txt_confirmerpassword=By.xpath("//*[@id=\"card_password\"]/div[4]/label/input");
    private By btn_continuer2=By.xpath("//*[@id=\"card_password\"]/div[5]/div/button/span[3]");
    private By txt_firstname=By.xpath("//*[@id=\"input_first_name\"]");
    private By txt_secondname=By.xpath("//*[@id=\"input_last_name\"]");
    private By txt_phonenumber=By.xpath("//*[@id=\"card_profile_details\"]/div[5]/div[2]/label/input");
    private By btn_continuer3=By.xpath("//*[@id=\"card_profile_details\"]/div[6]/div/button");
    private By txt_gender=By.xpath("//*[@id=\"card_profile_gender\"]/div/div[1]");
    private By txt_birthday=By.xpath("private By txt_gender=By.xpath(\"//*[@id=\\\"card_profile_gender\\\"]/div/div[1]\");");
    private By btn_continuer4=By.xpath("//*[@id=\"card_profile_gender\"]/div/div[3]/div/button/span[3]");	
    //Code Pin
    private By txt_pin1=By.xpath("//*[@id=\"pin\"]/label[1]/input");
    private By txt_pin2=By.xpath("//*[@id=\"pin\"]/label[2]/input");
    private By txt_pin3=By.xpath("//*[@id=\"pin\"]/label[3]/input");
    private By txt_pin4=By.xpath("//*[@id=\"pin\"]/label[4]/input");
    private By txt_pin5=By.xpath("//*[@id=\"pin\"]/label[5]/input");
    private By txt_pin6=By.xpath("//*[@id=\"pin\"]/label[6]/input");
    //Confirmer Code Pin
    private By txt_confirmpin1=By.xpath("//*[@id=\"confirmPin\"]/label[1]/input");
    private By txt_confirmpin2=By.xpath("//*[@id=\"confirmPin\"]/label[2]/input");
    private By txt_confirmpin3=By.xpath("//*[@id=\"confirmPin\"]/label[3]/input");
    private By txt_confirmpin4=By.xpath("//*[@id=\"confirmPin\"]/label[3]/input");
    private By txt_confirmpin5=By.xpath("//*[@id=\"confirmPin\"]/label[4]/input");
    private By txt_confirmpin6=By.xpath("//*[@id=\"confirmPin\"]/label[5]/input");
    
    //<Méthodes>
    public void newsLetter_close() {
   	 driver.findElement(btn_close).click();
   	}

   	public void clickOnSeConnecter() {
       driver.findElement(btn_seconnecter1).click();	
   	}

   	public void clickOnVotreCompte() {
   	driver.findElement(btn_seconnecter2).click();	
   	}
   	
   	public void enterEmail(String arg1) {
   	driver.findElement(txt_email).sendKeys(arg1);
   	}
   	
   	public void clickOnContinuer1() {
   	driver.findElement(btn_continuer1).click();	
   	}
   	
   	public void enterPassword(String arg2) {
   	System.out.println(arg2+"/");
   	driver.findElement(txt_password).sendKeys(arg2);
   	}
   	
   	public void confirmerPassword(String arg3) {
   	   	System.out.println(arg3+"/");
   	   	driver.findElement(txt_confirmerpassword).sendKeys(arg3);
   	   	}
   	
   	public void clickOnContinuer2() {
   	   	driver.findElement(btn_continuer2).click();	
   	   	}
   	
   	public void enterPrenom(String arg4) {
   	   	driver.findElement(txt_firstname).sendKeys(arg4);
   	   	}
   	
  	public void enterNomFamille(String arg5) {
   	   	driver.findElement(txt_secondname).sendKeys(arg5);
   	   	}
  	
  	public void enterNumTel(String arg6) {
   	   	driver.findElement(txt_phonenumber).sendKeys(arg6);
   	   	}
  	
  	public void clickOnContinuer3() {
   	   	driver.findElement(btn_continuer3).click();	
   	   	}
  	
  	public void selectGender(String arg7 ) {
  		Select drpCountry= new Select(driver.findElement(txt_gender));
  	    drpCountry.selectByVisibleText(arg7);
   	   	}
  	
  	public void enterDateNaissance(String arg8) {
   	   	driver.findElement(txt_birthday).sendKeys(arg8);
   	   	}
  	
  	public void clickOnContinuer4() {
  		driver.findElement(btn_continuer4).click();	
   	   	}
   
}
