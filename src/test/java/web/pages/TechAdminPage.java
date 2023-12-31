package web.pages;

import com.codeborne.selenide.SelenideElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import web.elements.BaseElement;
import web.elements.Button;

import static com.codeborne.selenide.Selenide.$x;

public class TechAdminPage extends BasePage {
    private static final Logger logger = LogManager.getLogger(TechAdminPage.class);
    private SelenideElement titleTechAdmin = $x("//h4[text()='Техническое администирование']");

    public BaseElement titleTechAdmin() {
        return new BaseElement(titleTechAdmin);
    }
}
