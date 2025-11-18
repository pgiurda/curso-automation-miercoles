package com.automatizacion.clase8.pages.EjercicioClase8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage{
    private By dropdownMyAccount = By.xpath("//li/a[@title=\"My Account\"]");
    //private By menuLogin = By.xpath("dropdown-menu dropdown-menu-right");
    private By linkLogin = By.xpath("//a[text()=\"Login\"]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void clickMyAccount(){
    click(dropdownMyAccount);
    }
    public void abrirLogin(){
    click(linkLogin);
    }
}
