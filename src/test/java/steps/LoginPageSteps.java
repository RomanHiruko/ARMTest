package steps;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import web.pages.LoginPage;

import static com.codeborne.selenide.Selenide.Wait;

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

    @Тогда("Проверить, что выполнена авторизация")
    public void checkAuthDone() {
        String beforeAuthURL = loginPage.getURL();
        Wait().until(driver -> !WebDriverRunner.url().equals(beforeAuthURL));
        String afterAuthURL = loginPage.getURL();
        Assertions.assertNotEquals(beforeAuthURL, afterAuthURL);
    }
}
