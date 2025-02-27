import java.util.List;

class SalesInvoice {
    private String invoiceID;
    private Customer customer;
    private Salesperson salesperson;
    private Vehicle vehicle;
    private TradeInVehicle tradeInVehicle;
    private List<DealerInstalledOption> dealerInstalledOptions;
    private double finalPrice;
    private double taxAndRegistrationFee;
    private double totalPrice;
    private boolean signed;
}