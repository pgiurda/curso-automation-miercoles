package com.automatizacion.clase8.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private By searchInput = By.xpath("//input[@name=\"search\"]");
    private By searchBtn = By.xpath("//button[@class=\"btn btn-default btn-lg\"]");
    private By carousel = By.xpath("//div[@id=\"slideshow0\"]");
    private By navbar = By.xpath("//nav[@id=\"menu\"]");
    private By dropdown = By.xpath("//li/a[@title=\"My Account\"]");
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
}
