package ui.steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.bg.И;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import ui.web.pages.GlobalManagerPage;

public class GlobalManagerPageSteps {
    private static final Logger logger = LogManager.getLogger(GlobalManagerPageSteps.class);
    private GlobalManagerPage globalManagerPage = new GlobalManagerPage();
    @И("Открыта страница \"Все заявки\"")
    public void globalManagerPageIsLoaded() {
        globalManagerPage.titleGlobalManager().getSelenideElement().shouldBe(Condition.visible);
        Assertions.assertTrue(globalManagerPage.titleGlobalManager().isDisplayed());
    }
}
