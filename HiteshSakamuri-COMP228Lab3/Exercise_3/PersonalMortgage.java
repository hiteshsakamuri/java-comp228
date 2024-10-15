public class PersonalMortgage extends Mortgage {
    public PersonalMortgage(String mortgageNumber, String customerName, double mortgageAmount, double currentRate, int term) {
        super(mortgageNumber, customerName, mortgageAmount, currentRate + 2.0, term);
        setInterestRate(currentRate);
    }

    @Override
    public void setInterestRate(double primeRate) {
        this.interestRate = primeRate + 2.0;
    }
}
