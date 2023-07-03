package steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import web.pages.SupermanagerPage;

public class SupermanagerPageSteps {
    private static final Logger logger = LogManager.getLogger(SupermanagerPageSteps.class);
    private SupermanagerPage supermanagerPage = new SupermanagerPage();

    public boolean isLoaded() {
        return supermanagerPage.title().isDisplayed();
    }
}
