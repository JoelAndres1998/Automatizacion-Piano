import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertieConnection {
    static String projectPath = System.getProperty("user.dir");
    static FileInputStream propsFile;
    static Properties properties;
    public static String docProperties(String value) throws IOException {
        properties = new Properties();
        propsFile = new FileInputStream(projectPath + "/src/main/resources/configure.properties");
        properties.load(propsFile);
        return properties.getProperty(String.valueOf(value));
    }
}
