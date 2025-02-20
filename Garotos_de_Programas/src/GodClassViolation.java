
public class GodClassViolation {
	public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }
}

class Application {
    private AuthenticationService authenticationService;
    private DashboardService dashboardService;
    private PaymentService paymentService;
    private ReportService reportService;

    public Application() {
        this.authenticationService = new AuthenticationService();
        this.dashboardService = new DashboardService();
        this.paymentService = new PaymentService();
        this.reportService = new ReportService();
    }

    public void run() {
        System.out.println("Running application...");
        authenticationService.authenticateUser();
        dashboardService.loadDashboard();
        paymentService.processPayments();
        reportService.generateReports();
    }
}

class AuthenticationService {
    public void authenticateUser() {
        System.out.println("Authenticating user...");
    }
}

class DashboardService {
    public void loadDashboard() {
        System.out.println("Loading dashboard...");
    }
}

class PaymentService {
    public void processPayments() {
        System.out.println("Processing payments...");
    }
}

class ReportService {
    public void generateReports() {
        System.out.println("Generating reports...");
    }
}

