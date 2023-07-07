package ui.web.elements;

import com.codeborne.selenide.SelenideElement;

public class Button extends BaseElement {
    public Button(SelenideElement webElement) {
        super(webElement);
    }

    public void click() {
        selenideElement.click();
    }
}