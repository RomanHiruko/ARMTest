package ui.hooks;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;

public class BeforeHooks {
    @BeforeEach
    public void setUp(){
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }
}
