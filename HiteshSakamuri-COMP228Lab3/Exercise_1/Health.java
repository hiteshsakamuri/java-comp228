public class Health extends Insurance{


    public Health() {
        super("Health Insurance");
    }

    void setInsuranceCost(double monthlyCost){

        this.MonthlyCost = monthlyCost;

    }

    void displayInfo(){

        System.out.println("You have an " + getInsuranceType() + " with a monthly cost of $" + getMonthlyCost());

    }
}
