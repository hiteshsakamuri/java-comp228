import java.util.Scanner;

public class GameTesterMain {
    public static void main(String[] args) {

        GameTester gameTester = null;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the game tester's name: ");
        String Name = scanner.nextLine();

        System.out.print("Enter the type of game tester (Full-Time/Part-Time): ");
        String TesterType = scanner.nextLine();


        if (TesterType.equalsIgnoreCase("Full-Time")) {
            gameTester = new FullTimeGameTester(Name);
        } else if (TesterType.equalsIgnoreCase("Part-Time")) {
            System.out.print("Enter the number of hours worked: ");
            int HoursWorked = scanner.nextInt();
            gameTester = new PartTimeGameTester(Name, HoursWorked);
        }


        System.out.println("\nGame Tester Information:");
        System.out.println("Name: " + gameTester.getName());
        System.out.println("Employment Status: " + (gameTester.IsFullTimeTester ? "Full-Time" : "Part-Time"));
        System.out.println("Calculated Salary: $" + gameTester.determineSalary());

        scanner.close();
    }
}
