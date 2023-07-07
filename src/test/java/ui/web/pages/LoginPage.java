package ui.web.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ui.web.elements.Button;
import ui.web.elements.TextBox;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage extends BasePage {
    private final Logger logger = LogManager.getLogger(LoginPage.class);
    private final String URL = "http://172.17.212.155:8080/";
    private SelenideElement loginTextBoxInput = $x("//input[@name='login']");
    private SelenideElement passwordTextBoxInput = $x("//input[@name='password']");
    private SelenideElement loginTextBoxClick = $x("//input[@name='login']/../..");
    private SelenideElement passwordTextBoxClick = $x("//input[@name='password']/../..");
    private SelenideElement continueButton = $x("//button[@type='submit']");

    public LoginPage() {
        Selenide.open(URL);
    }


    public TextBox loginTextBoxClick() {
        return new TextBox(loginTextBoxClick);
    }

    public TextBox passwordTextBoxClick() {
        return new TextBox(passwordTextBoxClick);
    }

    public TextBox loginTextBoxInput() {
        return new TextBox(loginTextBoxInput);
    }

    public TextBox passwordTextBoxInput() {
        return new TextBox(passwordTextBoxInput);
    }

    public Button continueButton() {
        return new Button(continueButton);
    }

}
