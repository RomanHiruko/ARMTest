package ui;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// @RunWith
// Класс для запуска тестов
@RunWith(Cucumber.class)

// Опции для запуска сценариев
@CucumberOptions(
        plugin = {"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"},
        // Список папок с feature файлами - фичи/сценарии
        features = {"src/test/resources/features/ui"},
        // Список пакетов с ui.steps файлами - шаги
        glue = {"ui.steps", "ui.hooks"},

        stepNotifications = true
)
public class RunCucumberTest {
}