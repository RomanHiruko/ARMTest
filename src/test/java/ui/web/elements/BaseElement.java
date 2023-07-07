package ui.web.elements;

import com.codeborne.selenide.SelenideElement;

public class BaseElement {
    protected SelenideElement selenideElement;

    public SelenideElement getSelenideElement(){
        return selenideElement;
    }
    public BaseElement(SelenideElement selenideElement) {
        this.selenideElement = selenideElement;
    }

    public boolean isDisplayed() {
        return selenideElement.isDisplayed();
    }
}