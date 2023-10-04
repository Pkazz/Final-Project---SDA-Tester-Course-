package Cucuumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources", // Ścieżka do plików z opisem scenariuszy Cucumber (np. .feature)
        glue = "com.example.steps" // Ścieżka do pakietu z definicjami kroków
)
public class CucumberTestRunner {
}
