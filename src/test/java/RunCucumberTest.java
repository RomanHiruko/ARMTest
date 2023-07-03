import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// @RunWith
// Класс для запуска тестов
@RunWith(Cucumber.class)

// Опции для запуска сценариев
@CucumberOptions(
        // Список папок с feature файлами - фичи/сценарии
        features = {"src/test/resources/features"},
        // Спиcок пакетов с steps файлами - шаги
        glue = {"steps"},

        stepNotifications = true
)
public class RunCucumberTest {
}