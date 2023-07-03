package web.elements;

import com.codeborne.selenide.SelenideElement;

public class BaseElement {
    protected SelenideElement webElement;

    public BaseElement(SelenideElement webElement) {
        this.webElement = webElement;
    }
    public boolean isDisplayed() {
        //............................................................................................костыль
        webElement.click();
        return webElement.isDisplayed();
    }
}