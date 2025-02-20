public class InterfaceSegregationViolation {
    public static void main(String[] args) {
        MultiFunctionPrinter printer = new MultiFunctionPrinter();
        printer.print();
        printer.scan();
        printer.fax();
    }
}

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

interface Fax {
    void fax();
}

class MultiFunctionPrinter implements Printer, Scanner, Fax {
    public void print() {
        System.out.println("Printando...");
    }

    public void scan() {
        System.out.println("Scaneando...");
    }

    public void fax() {
        System.out.println("Fixando...");
    }
}

class SimplePrinter implements Printer {
    public void print() {
        System.out.println("Printando...");
    }
}