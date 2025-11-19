package com.automatizacion.clase8.pages.EjercicioClase8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage{
    private By dropdownMyAccount = By.xpath("//li[@class=\"dropdown\"]");
    //private By menuLogin = By.xpath("dropdown-menu dropdown-menu-right");
    private By linkLogin = By.xpath("//a[text()=\"Login\"]");

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void clickMyAccount(){
    click(dropdownMyAccount);
    }
    public void abrirLogin(){
    click(linkLogin);
    }
}
