import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;

public class InsuranceMain {
    public static void main(String[] args) {
        Insurance[] policies = new Insurance[2];
        for (int i = 0; i < policies.length; i++) {
            String TypeOfInsurance = JOptionPane.showInputDialog("Enter your insurance choice: \na)Life\nb)Health");
            double MonthlyCost = Double.parseDouble(JOptionPane.showInputDialog("Enter your monthly cost: "));

            if(TypeOfInsurance.equalsIgnoreCase("Life")){
                policies[i] = new Life();
                policies[i].setInsuranceCost(MonthlyCost);
            }
            else if(TypeOfInsurance.equalsIgnoreCase("Health")){
                policies[i] = new Health();
                policies[i].setInsuranceCost(MonthlyCost);
            }
        }

        System.out.println("\nYour Policies Information:");
        for (Insurance policy : policies) {
            policy.displayInfo();
            System.out.println("--------------------");
        }

    }
}
