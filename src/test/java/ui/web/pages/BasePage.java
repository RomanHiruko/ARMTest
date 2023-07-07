package ui.web.pages;

import com.codeborne.selenide.WebDriverRunner;

public class BasePage {

    public String getURL() {
        return WebDriverRunner.url();
    }
}