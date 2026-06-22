package com.qa.stepdefinitions;

import com.qa.driver.DriverFactory;
import com.qa.pages.LoginPage;
import com.qa.utils.ConfigReader;
import io.cucumber.java.pt.*;

public class LoginSteps {

    LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Dado("que o usuário está na página de login")
    public void usuario_esta_na_pagina_de_login() {

        DriverFactory.getDriver().get(ConfigReader.getProperty("baseUrl"));

    }

    @Quando("o usuário informa o nome de usuário {string}")
    public void usuario_informa_nome_de_usuario(String username) {

        loginPage.enterUsername(username);

    }

    @Quando("o usuário informa a senha {string}")
    public void usuario_informa_senha(String password) {

        loginPage.enterPassword(password);

    }

    @Quando("o usuário clica no botão de login")
    public void usuario_clica_no_botao_de_login() {

        loginPage.clickLogin();

    }

    @Então("o usuário deve ser redirecionado para a página inicial")
    public void usuario_deve_ser_redirecionado_para_pagina_inicial() {

    }
}