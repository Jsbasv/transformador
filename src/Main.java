import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            // Obtain the path of the files XML and XSL
            String xmlPath = "data.xml";
            String xslPath = "transform.xsl";

            // Crea los objetos para la transformación
            TransformerFactory factory = TransformerFactory.newInstance();
            Source xslt = new StreamSource(new java.io.File(xslPath));
            Transformer transformer = factory.newTransformer(xslt);

            // Carga el archivo XML y realiza la transformación
            Source xml = new StreamSource(new java.io.File(xmlPath));

            //mostrar por consola
            transformer.transform(xml, new StreamResult(System.out));

            //trasladar a un fichero
            String outFileName = "resultado.html";
            transformer.transform(xml, new StreamResult(new File(outFileName)));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}