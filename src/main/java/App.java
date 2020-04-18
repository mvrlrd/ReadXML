public class App {
    public static void main(String[] args) {
        ReaderXml readerXml = new ReaderXml();
        readerXml.readXml();
        System.out.println(readerXml.counter);
    }
}
