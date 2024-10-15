abstract class GameTester {
    protected String Name;
    protected boolean IsFullTimeTester;

    public GameTester(String name, boolean isFullTimeTester) {
        this.Name = name;
        this.IsFullTimeTester = isFullTimeTester;
    }

    public String getName() {
        return Name;
    }

    public boolean isFullTimeTester() {
        return IsFullTimeTester;
    }

    public abstract double determineSalary();
}

