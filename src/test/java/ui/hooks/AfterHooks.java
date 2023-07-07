package ui.hooks;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;

public class AfterHooks {
    @After
    public void afterScenario(){
        Selenide.closeWebDriver();
    }
}
