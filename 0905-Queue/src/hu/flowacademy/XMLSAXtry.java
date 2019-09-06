package hu.flowacademy;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParserFactory;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class XMLSAXtry {
    private static final class ClassHandler extends DefaultHandler {
        public List<Student> students = new ArrayList<>();
        boolean startFirstName = false;
        boolean startLastName = false;
        boolean startNickName = false;
        boolean startMarks = false;
        String firstN;
        String lastN;
        String nickN;
        String marks;

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            if (qName.equals("firstname")) {
                startFirstName = true;
            } else if (qName.equals("lastname")) {
                startLastName = true;
            } else if (qName.equals("nickname")) {
                startNickName = true;
            } else if (qName.equals("marks")) {
                startMarks = true;
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {

            if (startFirstName) {
                firstN = new String(ch, start, length);
                startFirstName = false;
            } else if (startLastName) {
                lastN = new String(ch, start, length);
                startLastName = false;
            } else if (startNickName) {
                nickN = new String(ch, start, length);
                startNickName = false;
            } else if (startMarks) {
                marks = new String(ch, start, length);
                startMarks = false;
                students.add(new Student(this.firstN, this.lastN, this.nickN, Integer.parseInt(this.marks)));
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            super.endElement(uri, localName, qName);
        }
    }

    public static void xmlLoaderSax() throws Exception {
        var parser = SAXParserFactory.newDefaultInstance().newSAXParser();
        try (InputStream in = XMLSAXtry.class.getResourceAsStream("students.xml")) {
            var handler = new ClassHandler();
            parser.parse(in, handler);

            handler.students.forEach(System.out::println);
        }
    }
}
