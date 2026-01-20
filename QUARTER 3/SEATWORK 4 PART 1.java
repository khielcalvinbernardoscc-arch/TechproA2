class PaymentProcessor {
    
    public void processPayment(double amount, String currency) {
        System.out.println("Processing payment of " + amount + " " + currency);
    }

    
    public void processPayment(double amount, String currency, String paymentMethod) {
        System.out.println("Processing payment of "    + amount + " "   + currency + " via " 
                + paymentMethod);
    }

 
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

     
        processor.processPayment(1500.00, "PHP");
        processor.processPayment(1567.00, "PHP", "GCash");
    }
}



