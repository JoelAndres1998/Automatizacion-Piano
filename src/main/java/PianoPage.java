import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class PianoPage {
    private WebDriver driver;

    public PianoPage(WebDriver driver) {
        this.driver = driver;
    }

    private By si = By.cssSelector("[data-key='219']");
    private By do_ = By.cssSelector("[data-key='84']");
    private By re = By.cssSelector("[data-key='89']");
    private By la = By.cssSelector("[data-key='80']");
    private By sol = By.cssSelector("[data-key='79']");
    private By fa = By.cssSelector("[data-key='73']");

    private void tocarNota(By notaSelector, String nota, String escenario) throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement notaElemento = wait.until(ExpectedConditions.elementToBeClickable(notaSelector));
            new Actions(driver).moveToElement(notaElemento).click().perform();
            Thread.sleep(200);
            TestReport.resultadoPaso(escenario, nota, true, "Nota ejecutada correctamente");
        } catch (Exception e) {
            TestReport.resultadoPaso(escenario, nota, false, e.getMessage());
            throw e;
        }
    }

    public void tocarSi(String escenario) throws InterruptedException { tocarNota(si, "Si", escenario); }
    public void tocarDo(String escenario) throws InterruptedException { tocarNota(do_, "Do", escenario); }
    public void tocarRe(String escenario) throws InterruptedException { tocarNota(re, "Re", escenario); }
    public void tocarLa(String escenario) throws InterruptedException { tocarNota(la, "La", escenario); }
    public void tocarSol(String escenario) throws InterruptedException { tocarNota(sol, "Sol", escenario); }
    public void tocarFa(String escenario) throws InterruptedException { tocarNota(fa, "Fa", escenario); }
}
