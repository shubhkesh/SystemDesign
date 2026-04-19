package FactoryDesignPattern;

public class DocumentFactory {

    public static Document createDocument(String documentType) {

        switch (documentType.toLowerCase()) {

            case "pdf":
                return new PDFDocument();
            case "html":
                return new HTMLDocument();
            case "doc":
                return new WordDocument();
            default:
                throw new IllegalArgumentException("Invalid document type " + documentType);
        }

    }

}
