package com.automatizacion.clase8;

import com.automatizacion.clase8.pages.EjercicioClase8.LoginPage;
import com.automatizacion.clase8.pages.EjercicioClase8.ResultadoLogin;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageTest extends BaseTest{

    @Test
    public void loginPageTest() {
        LoginPage loginPage = new LoginPage(getDriver());
        ResultadoLogin resultadoLogin = new ResultadoLogin(getDriver());

        getDriver().get("https://opencart.abstracta.us/");

        Assert.assertEquals(resultadoLogin.getTitle(),"Returning Customer", "El titulo no coincide");
    }
}
