import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

public class PianoTest {
    private WebDriver driver;

    @Before
    public void connection() throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        String url = PropertieConnection.docProperties("URL");
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        TestReport.iniciarReporte();
    }

    @Test
    public void escenario1() throws InterruptedException {
        Escenarios.secuencia1(driver);
    }

    @Test
    public void escenario2() throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            Escenarios.secuencia1(driver);
        }
    }

    @Test
    public void escenario3() throws InterruptedException {
        Escenarios.secuencia3(driver);
    }

    @After
    public void close() throws IOException {
        driver.close();
        String projectpath = System.getProperty("user.dir");
        String informepath =projectpath + "/src/main/resources/Informes/InformePiano.html";
        TestReport.finReporte(informepath);
    }
}

