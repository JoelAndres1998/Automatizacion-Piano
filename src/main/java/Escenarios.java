import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Escenarios {
    static String cssSi = "[data-key=\"219\"]";
    static String cssDo = "[data-key=\"84\"]";
    static String cssRe = "[data-key=\"89\"]";
    static String cssLa = "[data-key=\"80\"]";
    static String cssSol = "[data-key=\"79\"]";
    static String cssFa = "[data-key=\"73\"]";

    public static void secuencia1(WebDriver driver) throws InterruptedException {
        click(driver, cssSi, "Si", "Escenario 1");
        click(driver, cssSi, "Si", "Escenario 1");
        click(driver, cssDo, "Do", "Escenario 1");
        click(driver, cssRe, "Re", "Escenario 1");
        click(driver, cssRe, "Re", "Escenario 1");
        click(driver, cssDo, "Do", "Escenario 1");
        click(driver, cssSi, "Si", "Escenario 1");
        click(driver, cssLa, "La", "Escenario 1");
        click(driver, cssSol, "Sol", "Escenario 1");
        click(driver, cssSol, "Sol", "Escenario 1");
        click(driver, cssLa, "La", "Escenario 1");
        click(driver, cssSi, "Si", "Escenario 1");
        click(driver, cssSi, "Si", "Escenario 1");
        click(driver, cssLa, "La", "Escenario 1");
    }

    public static void secuencia3(WebDriver driver) throws InterruptedException {
        click(driver, cssSi, "Si", "Escenario 3");
        click(driver, cssSi, "Si", "Escenario 3");
        click(driver, cssDo, "Do", "Escenario 3");
        click(driver, cssRe, "Re", "Escenario 3");
        click(driver, cssRe, "Re", "Escenario 3");
        click(driver, cssDo, "Do", "Escenario 3");
        click(driver, cssSi, "Si", "Escenario 3");
        click(driver, cssLa, "La", "Escenario 3");
        click(driver, cssSol, "Sol", "Escenario 3");
        click(driver, cssSol, "Sol", "Escenario 3");
        click(driver, cssLa, "La", "Escenario 3");
        click(driver, cssSi, "Si", "Escenario 3");
        click(driver, cssLa, "La", "Escenario 3");
        click(driver, cssSol, "Sol", "Escenario 3");
        click(driver, cssSol, "Sol", "Escenario 3");
        click(driver, cssLa, "La", "Escenario 3");
        click(driver, cssSi, "Si", "Escenario 3");
        click(driver, cssSol, "Sol", "Escenario 3");
        click(driver, cssLa, "La", "Escenario 3");
        click(driver, cssSi, "Si", "Escenario 3");
        click(driver, cssDo, "Do", "Escenario 3");
        click(driver, cssSi, "Si", "Escenario 3");
        click(driver, cssSol, "Sol", "Escenario 3");
        click(driver, cssLa, "La", "Escenario 3");
        click(driver, cssSi, "Si", "Escenario 3");
        click(driver, cssDo, "Do", "Escenario 3");
        click(driver, cssSi, "Si", "Escenario 3");
        click(driver, cssSol, "Sol", "Escenario 3");
        click(driver, cssSol, "Sol", "Escenario 3");
        click(driver, cssFa, "Fa", "Escenario 3");
        click(driver, cssRe, "Re", "Escenario 3");
    }

    public static void click(WebDriver driver, String selector, String nota, String escenario) throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement option = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(selector)));
            Actions actions = new Actions(driver);
            actions.moveToElement(option).click().perform();
            Thread.sleep(200);

            TestReport.resultadoPaso(escenario, nota, true, "Nota ejecutada correctamente");

        } catch (Exception e) {
            TestReport.resultadoPaso(escenario, nota, false, e.getMessage());
            throw e;
        }
    }
}
