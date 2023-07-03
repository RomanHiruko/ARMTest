package steps;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideWait;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import web.pages.LoginPage;

public class LoginPageSteps {
    private static final Logger logger = LogManager.getLogger(LoginPageSteps.class);
    private LoginPage loginPage;


    @Дано("Открыта страница \"Страница авторизации\"")
    public void openLoginPage() {
        Configuration.pageLoadTimeout = 60000;
        Configuration.timeout = 60000;
        loginPage = new LoginPage();
        logger.info("Открыта страница авторизации");
    }

    @Когда("Введен логин {string} в поле \"Логин\"")
    public void enterLogin(String login) {
        loginPage.loginTextBoxClick().click();
        loginPage.loginTextBoxInput().setValue(login);
    }

    @Когда("Введен пароль {string} в поле \"Пароль\"")
    public void enterPassword(String password) {
        loginPage.passwordTextBoxClick().click();
        loginPage.passwordTextBoxInput().setValue(password);
    }

    @Когда("Нажата кнопка \"Продолжить\"")
    public void pressContinueButton() {
        loginPage.continueButton().click();
    }

    @Тогда("Проверить, что выполнена авторизация и открыта страница \"Техническое администирование\"")
    public void checkAuthDone() {
        SupermanagerPageSteps supermanagerPageSteps = new SupermanagerPageSteps();
        Assertions.assertTrue(supermanagerPageSteps.isLoaded());
    }
}
