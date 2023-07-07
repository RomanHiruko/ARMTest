package ui.web.pages;

import com.codeborne.selenide.SelenideElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ui.web.elements.BaseElement;

import static com.codeborne.selenide.Selenide.$x;

public class GlobalManagerPage extends BasePage {
    private final Logger logger = LogManager.getLogger(GlobalManagerPage.class);
    private SelenideElement titleGlobalManager = $x("//h1[text()='Все заявки']");

    public BaseElement titleGlobalManager() {
        return new BaseElement(titleGlobalManager);
    }
}
