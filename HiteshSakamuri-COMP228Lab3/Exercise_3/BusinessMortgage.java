public class BusinessMortgage extends Mortgage {
    public BusinessMortgage(String mortgageNumber, String customerName, double mortgageAmount, double currentRate, int term) {
        super(mortgageNumber, customerName, mortgageAmount, currentRate + 1.0, term);
        setInterestRate(currentRate);
    }

    @Override
    public void setInterestRate(double currentRate) {
        this.interestRate = currentRate + 1.0;
    }
}
