package AdapterPattern;

public class XMLToJsonConverter implements JSONData{
    XMLData xmlData;
    XMLToJsonConverter(XMLData xmlData){
        this.xmlData = xmlData;
    }

    @Override
    public String getJSON() {
        return xmlData.getXML() + " converting to JSON";
    }
}
