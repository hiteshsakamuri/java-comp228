abstract class Insurance {

    protected String InsuranceType;
    protected double MonthlyCost;

    public Insurance(String insuranceType){

        this.InsuranceType = insuranceType;
    }

    public String getInsuranceType(){
        return InsuranceType;
    }

    public double getMonthlyCost(){
        return MonthlyCost;
    }

    abstract void setInsuranceCost(double monthlyCost);

    abstract void displayInfo();





}
