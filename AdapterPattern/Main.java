package AdapterPattern;

public class Main {
    public static void main(String[] args) {
        XMLData xmlData = new XMLData();
        JSONData jsonData = new XMLToJsonConverter(xmlData);
        System.out.println(jsonData.getJSON());
    }
}
