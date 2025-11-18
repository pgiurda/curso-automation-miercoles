package com.automatizacion.clase8.pages.EjercicioClase8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultadoLogin {
    private By titleLogin = By.xpath("//h2[text()=\"Returning Customer\" ]");
    private WebDriver driver;

    public ResultadoLogin(WebDriver driver){
        this.driver = driver;
    }
    public String getTitle() {
        WebElement element = driver.findElement(titleLogin);
        return element.getText();
    }
}
