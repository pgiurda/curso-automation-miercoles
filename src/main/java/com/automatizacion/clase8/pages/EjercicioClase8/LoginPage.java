package com.automatizacion.clase8.pages.EjercicioClase8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage{
    private By emailLogin = By.xpath("//input[@id=\"input-email\"]");
    private By passwordLogin = By.xpath("//input[@id=\"input-password\"]");
    private By buttonLogin = By.xpath("//input[@class=\"btn btn-primary\"]");

    public LoginPage(WebDriver driver){
        super(driver);
    }
    public void ingresarEmail(){
        hacerClear(emailLogin);
        sendKeys(emailLogin,"pgiurda@hotmail.com");
    }
    public void invalidEmail(){
        hacerClear(emailLogin);
        sendKeys(emailLogin,"email@email.com");
    }
    public void invalidPassword(){
        hacerClear(passwordLogin);
        sendKeys(passwordLogin,"555xxx");
    }
    public void ingresarPassword(){
        hacerClear(passwordLogin);
        sendKeys(passwordLogin,"1234abc");
    }
    public void clickLogin(){
        click(buttonLogin);
    }


}
