package web.elements;

import com.codeborne.selenide.SelenideElement;

public class TextBox extends BaseElement {
    public TextBox(SelenideElement webElement) {
        super(webElement);
    }

    public void click() {
        webElement.click();
    }

    public void setValue(String value) {
        webElement.sendKeys(value);
    }
}