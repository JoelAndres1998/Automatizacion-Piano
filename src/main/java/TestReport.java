import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestReport {
    private static StringBuilder html = new StringBuilder();

    public static void iniciarReporte() {
        html.append("<html><head><title>Informe Piano</title>");
        html.append("<style>");
        html.append("body { font-family: Arial; }");
        html.append("table { border-collapse: collapse; width: 80%; }");
        html.append("th, td { border: 1px solid black; padding: 8px; text-align: center; }");
        html.append("th { background-color: #f2f2f2; }");
        html.append(".passed { background-color: #d4edda; }");
        html.append(".failed { background-color: #f8d7da; }");
        html.append("</style></head><body>");
        html.append("<h1>Informe de pruebas Piano Virtual</h1>");
        html.append("<table><tr><th>Escenario</th><th>Fecha/Hora</th><th>Estado</th><th>Detalles</th></tr>");
    }

    // Registrar resultado de cada paso (nota)
    public static void resultadoPaso(String escenario, String nota, boolean passed, String details) {
        String estado = passed ? "PASADO" : "FALLIDO";
        String color = passed ? "#d4edda" : "#f8d7da";
        String fecha = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        html.append("<tr style='background-color:" + color + "'>");
        html.append("<td>" + escenario + "</td>");
        html.append("<td>" + fecha + "</td>");
        html.append("<td>" + estado + "</td>");
        html.append("<td>Nota: " + nota + " - " + details + "</td>");
        html.append("</tr>");
    }

    public static void finReporte(String filePath) throws IOException {
        html.append("</table></body></html>");
        FileWriter writer = new FileWriter(filePath);
        writer.write(html.toString());
        writer.close();
    }
}
