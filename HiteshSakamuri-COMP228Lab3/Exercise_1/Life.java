public class Life extends Insurance{


    public Life() {
        super("Life Insurance");
    }

    void setInsuranceCost(double monthlyCost){

        this.MonthlyCost = monthlyCost;

    }

    void displayInfo(){

        System.out.println("You have an " + getInsuranceType() + " with a monthly cost of $" + getMonthlyCost());

    }
}
