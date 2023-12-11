import java.util.Arrays;
import java.util.List;

public class Element {
    String name;
    int totalElements;
    int lastElement;

    public Element(String name, int totalElements, int lastElement) {
        this.name = name;
        this.totalElements = totalElements;
        this.lastElement = lastElement;
    }

    public static void main(String[] args) {
        List<Element> elements = Arrays.asList(
            new Element("Cireng", 4, 4),
            new Element("4", 4, 4),
            new Element("Al-Qarni", 5, 5),
            new Element("Al-Qarni", 5, 5)
        );

        for (int i = 0; i < elements.size(); i++) {
            Element e = elements.get(i);
            System.out.println("Element 0: " + e.name + " total element: " + e.totalElements + " elemen terakhir: " + e.lastElement);
        }

        System.out.println("Names: [My Kid, Akhleema, Shannum, Uwais, Al-Qarni]");
    }
}
