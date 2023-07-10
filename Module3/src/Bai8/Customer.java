package Bai8;

class Customer extends Person {
    private String companyName;
    private double invoiceValue;
    private String evaluation;

    public Customer(String fullName, String address, String companyName, double invoiceValue) {
        super(fullName, address);
        this.companyName = companyName;
        this.invoiceValue = invoiceValue;
        this.evaluation = "";
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public String toString() {
        return super.toString() + "\nCompany Name: " + companyName + "\nInvoice Value: " + invoiceValue +
               "\nEvaluation: " + evaluation;
    }
}