package steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.bg.И;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.Wait;
import web.pages.TechAdminPage;

public class TechAdminPageSteps {
    private static final Logger logger = LogManager.getLogger(TechAdminPageSteps.class);
    private TechAdminPage techAdminPage = new TechAdminPage();

    @И("Открыта страница \"Техническое администрирование\"")
    public void techAdminPageIsLoaded() {
        techAdminPage.titleTechAdmin().getSelenideElement().shouldBe(Condition.visible);
        Assertions.assertTrue(techAdminPage.titleTechAdmin().isDisplayed());
    }
}
