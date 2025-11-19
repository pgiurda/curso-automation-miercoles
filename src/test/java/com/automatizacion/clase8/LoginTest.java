package com.automatizacion.clase8;

import com.automatizacion.clase8.pages.EjercicioClase8.HomePage;
import com.automatizacion.clase8.pages.EjercicioClase8.LoginPage;
import com.automatizacion.clase8.pages.EjercicioClase8.ResultadoLogin;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void homePageTest() {
        HomePage homePage = new HomePage(getDriver());
        ResultadoLogin resultadoLogin = new ResultadoLogin(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());

        getDriver().get("https://opencart.abstracta.us/");
        homePage.clickMyAccount();
        homePage.abrirLogin();
        loginPage.ingresarEmail();
        loginPage.ingresarPassword();
        loginPage.clickLogin();

        Assert.assertEquals(resultadoLogin.getTitleLogin(),"My Account","No ingreso correctamente");
    }
    
    @Test
    public void invalidUserTest(){
        HomePage homePage = new HomePage(getDriver());
        ResultadoLogin resultadoLogin = new ResultadoLogin(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());

        getDriver().get("https://opencart.abstracta.us/");
        homePage.clickMyAccount();
        homePage.abrirLogin();
        loginPage.invalidEmail();
        loginPage.invalidPassword();
        loginPage.clickLogin();

        Assert.assertEquals(resultadoLogin.getAlertInvalidUser(),"Warning: No match for E-Mail Address and/or Password.","Ingreso con usuario valido");
    }
}
