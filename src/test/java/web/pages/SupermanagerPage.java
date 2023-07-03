package web.pages;

import com.codeborne.selenide.SelenideElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import web.elements.BaseElement;

import static com.codeborne.selenide.Selenide.$x;

public class SupermanagerPage extends BasePage {
    private static final Logger logger = LogManager.getLogger(SupermanagerPage.class);
    private SelenideElement title = $x("//h4[text()='Техническое администирование']");

    public SupermanagerPage() {
    }

    public BaseElement title() {
        return new BaseElement(title);
    }
}
