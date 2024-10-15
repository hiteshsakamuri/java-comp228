import java.util.Scanner;

public class ProcessMortgage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array to hold 3 mortgages
        Mortgage[] mortgages = new Mortgage[3];

        // Get the current prime interest rate
        System.out.print("Enter the current prime interest rate (as a percentage): ");
        double primeRate = input.nextDouble();

        // Loop to collect mortgage data
        for (int i = 0; i < mortgages.length; i++) {
            System.out.println("Enter details for Mortgage " + (i + 1));

            System.out.print("Enter Mortgage Number: ");
            String mortgageNumber = input.next();

            System.out.print("Enter Customer Name: ");
            String customerName = input.next();

            System.out.print("Enter Mortgage Amount: ");
            double mortgageAmount = input.nextDouble();

            System.out.print("Enter Term (1 for SHORT, 3 for MEDIUM, 5 for LONG): ");
            int term = input.nextInt();

            System.out.print("Enter type of mortgage (1 for Business, 2 for Personal): ");
            int type = input.nextInt();

            // Create the appropriate mortgage based on type
            if (type == 1) {
                mortgages[i] = new BusinessMortgage(mortgageNumber, customerName, mortgageAmount, primeRate, term);
            } else if (type == 2) {
                mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, mortgageAmount, primeRate, term);
            } else {
                System.out.println("Invalid mortgage type! Defaulting to PersonalMortgage.");
                mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, mortgageAmount, primeRate, term);
            }
        }

        // Display all mortgage information
        System.out.println("\n--- Mortgage Information ---");
        for (Mortgage mortgage : mortgages) {
            System.out.println(mortgage.getMortgageInfo());
            System.out.println("----------------------------");
        }

        input.close();
    }
}
