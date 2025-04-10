package Builder;

// Interface for all document types
 interface Document {}

// PDF Document implementation
 class PDFDocument implements Document {
    // Attributes and methods for PDF
}

// XML Document implementation
 class XMLDocument implements Document {
    // Attributes and methods for XML
}

 abstract class DocBuilder {
    public abstract void createDocument();
    public abstract void createText();
    public abstract void createImages();
    public abstract Document getDocument();
}

 class PDFDocBuilder extends DocBuilder {
    private PDFDocument pdfDoc;

    public void createDocument() {
        this.pdfDoc = new PDFDocument();
    }

    public void createText() {
        System.out.println("Adding text to PDF");
    }

    public void createImages() {
        System.out.println("Adding images to PDF");
    }

    public Document getDocument() {
        return this.pdfDoc;
    }
}

 class XMLDocBuilder extends DocBuilder {
    private XMLDocument xmlDoc;

    public void createDocument() {
        this.xmlDoc = new XMLDocument();
    }

    public void createText() {
        System.out.println("Adding text to XML");
    }

    public void createImages() {
        System.out.println("Adding images to XML");
    }

    public Document getDocument() {
        return this.xmlDoc;
    }
}

 class DocCreationEngine {
    public void generateDocument(DocBuilder builder) {
        builder.createDocument();  // Initialize document
        builder.createText();      // Add text
        builder.createImages();    // Add images
    }
}




public class Main {
    public static void main(String[] args) {
        DocCreationEngine engine = new DocCreationEngine();

        // Build PDF Document
        PDFDocBuilder pdfBuilder = new PDFDocBuilder();
        engine.generateDocument(pdfBuilder);
        PDFDocument pdf = (PDFDocument) pdfBuilder.getDocument();

        // Build XML Document
        XMLDocBuilder xmlBuilder = new XMLDocBuilder();
        engine.generateDocument(xmlBuilder);
        XMLDocument xml = (XMLDocument) xmlBuilder.getDocument();
    }
}
