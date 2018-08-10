import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
/**
 * Created by expertzlab12 on 8/8/18.
 */
public class DomParserEx {
    public static void main(String[] args) {
        try {
            File inputFile = new File("input.txt");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element:" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("food");
            System.out.println("---------------------------");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\n current Element:" + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("dish name:" + eElement.getElementsByTagName
                            ("name").item(0).getTextContent());
                    System.out.println("cost:" + eElement.getElementsByTagName
                            ("price").item(0).getTextContent());
                    System.out.println("Description:" + eElement.getElementsByTagName
                            ("description").item(0).getTextContent());
                    System.out.println("energy:" + eElement.getElementsByTagName
                            ("calories").item(0).getTextContent());}}
        } catch (Exception e) {
            e.printStackTrace();}}}