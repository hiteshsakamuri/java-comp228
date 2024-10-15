public abstract class Mortgage implements MortgageConstants {
    private String mortgageNumber;
    private String customerName;
    protected double mortgageAmount;
    protected double interestRate;
    private int term;

    public Mortgage(String mortgageNumber, String customerName, double mortgageAmount, double interestRate, int term) {
        if (mortgageAmount > MAX_MORTGAGE_AMOUNT) {
            throw new IllegalArgumentException("Mortgage amount cannot exceed " + MAX_MORTGAGE_AMOUNT);
        }

        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        this.mortgageAmount = mortgageAmount;
        this.interestRate = interestRate;

        // Set term to SHORT_TERM if it's invalid
        if (term != SHORT_TERM && term != MEDIUM_TERM && term != LONG_TERM) {
            this.term = SHORT_TERM;
        } else {
            this.term = term;
        }
    }

    public abstract void setInterestRate(double primeRate);

    public String getMortgageInfo() {
        return "Mortgage Number: " + mortgageNumber +
                "\nCustomer Name: " + customerName +
                "\nMortgage Amount: $" + mortgageAmount +
                "\nInterest Rate: " + interestRate + "%" +
                "\nTerm: " + term + " year(s)" +
                "\nTotal Owed: $" + calculateTotalOwed();
    }

    public double calculateTotalOwed() {
        return mortgageAmount + (mortgageAmount * (interestRate / 100) * term);
    }
}

