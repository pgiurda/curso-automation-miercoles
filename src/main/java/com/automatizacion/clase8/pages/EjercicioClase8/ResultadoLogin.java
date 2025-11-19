package com.automatizacion.clase8.pages.EjercicioClase8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultadoLogin {
    private By titleMyAccount = By.xpath("//h2[text()=\"My Account\"] ");
    private WebDriver driver;
    private By alertInvalidUser = By.xpath("//div[text()=\" Warning: No match for E-Mail Address and/or Password.\"]");

    public ResultadoLogin(WebDriver driver){
        this.driver = driver;
    }

    public String getTitleLogin(){
        WebElement element = driver.findElement(titleMyAccount);
        return element.getText();
    }
    public String getAlertInvalidUser(){
        WebElement element = driver.findElement(alertInvalidUser);
        return element.getText();
    }
}
