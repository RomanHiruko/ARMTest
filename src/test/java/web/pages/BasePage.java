package web.pages;
import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.Before;

public class BasePage {

    @Before
    public void setUp() {
        String browser = System.getProperty("browser");

        if (browser == null) {
            // По умолчанию запускаем Chrome
            Configuration.browser = "chrome";
        } else {
            switch (browser.toLowerCase()) {
                case "chrome":
                    Configuration.browser = "chrome";
                    break;
                case "firefox":
                    Configuration.browser = "firefox";
                    break;
                case "safari":
                    Configuration.browser = "safari";
                    break;
                case "edge":
                    Configuration.browser = "edge";
                    break;
                default:
                    throw new IllegalArgumentException("Invalid browser specified: " + browser);
            }
        }

        // Дополнительные настройки, если необходимо
    }

    @After
    public void tearDown() {
        // Код для очистки и восстановления страницы после каждого тестового метода
    }
}