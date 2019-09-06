package hu.flowacademy;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class XMLDOMtry {
    public static void xmlLoaderDom() throws Exception {
        DocumentBuilder docBuilder = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder();

        try (InputStream inputStream = XMLDOMtry.class.getResourceAsStream("students.xml")){
            Document doc = docBuilder.parse(inputStream);
            Element Class = doc.getDocumentElement();

            NodeList studentNodeList = Class.getElementsByTagName("student");
            List<Element> studentList = new ArrayList<>();
            for (int i = 0; i < studentNodeList.getLength(); i++) {
                studentList.add((Element)studentNodeList.item(i));
            }

            studentList.stream()
                    .map(e -> new Student(
                            e.getElementsByTagName("firstname").item(0).getTextContent(),
                            e.getElementsByTagName("lastname").item(0).getTextContent(),
                            e.getElementsByTagName("nickname").item(0).getTextContent(),
                            Integer.parseInt(e.getElementsByTagName("marks").item(0).getTextContent())))
                    .forEach(q -> System.out.println(q));
        }
    }
}
