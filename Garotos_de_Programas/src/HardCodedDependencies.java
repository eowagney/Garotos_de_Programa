
public class HardCodedDependencies {
	public static void main(String[] args) {
        Report report = new Report();
        report.generatePDFReport();
    }
}

class Report {
	
	public Report() {
		generatePDFReport();
	}
    public void generatePDFReport() {
        System.out.println("Generating PDF Report...");
    }
}
