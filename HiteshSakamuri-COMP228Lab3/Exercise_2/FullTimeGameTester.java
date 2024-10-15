class FullTimeGameTester extends GameTester {
    private final double BaseSalary = 3000;

    public FullTimeGameTester(String name) {
        super(name, true);
    }

    public double determineSalary() {
        return BaseSalary;
    }
}


