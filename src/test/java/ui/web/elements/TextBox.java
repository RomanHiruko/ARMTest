package ui.web.elements;

import com.codeborne.selenide.SelenideElement;

public class TextBox extends BaseElement {
    public TextBox(SelenideElement webElement) {
        super(webElement);
    }

    public void click() {
        selenideElement.click();
    }

    public void setValue(String value) {
        selenideElement.sendKeys(value);
    }
}