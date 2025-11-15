package com.automatizacion.clase7.EjercicioClase7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class EjercicioBusqueda2 {
    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximed");
        options.addArguments("incognito");
        options.setPageLoadTimeout(Duration.ofSeconds(60));
        this.driver = new ChromeDriver(options);
    }
    @AfterMethod
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
    @Test
    public void Busqueda2(){
        driver.get("https://opencart.abstracta.us");

        By searchInput = By.xpath("//input[@name=\"search\"]");
        By carousel = By.xpath("//div[@id=\"slideshow0\"]");
        By navbar = By.xpath("//nav[@id=\"menu\"]");
        By dropdown = By.xpath("//li/a[@title=\"My Account\"]");

        WebElement searchInputEl = driver.findElement(searchInput);
        WebElement carouselEl = driver.findElement(carousel);
        WebElement navbarEl = driver.findElement(navbar);
        WebElement dropdownEl = driver.findElement(dropdown);

        Assert.assertTrue(searchInputEl.isDisplayed(),"Search no visible");
        Assert.assertTrue(carouselEl.isDisplayed(),"Carousel no visible");
        Assert.assertTrue(navbarEl.isDisplayed(),"Navbar no visible");
        Assert.assertTrue(dropdownEl.isDisplayed(),"Dropdown no visible");
    }

}
