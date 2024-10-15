class PartTimeGameTester extends GameTester {
    private final int HoursWorked;

    public PartTimeGameTester(String name, int hoursWorked) {
        super(name, false);
        this.HoursWorked = hoursWorked;
    }

    public double determineSalary() {
        double HourlyPay = 20;
        return HoursWorked * HourlyPay;
    }
}
