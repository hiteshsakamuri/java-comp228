import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class LottoMain {

    public static void main(String[] args) {

        playGame();

    }

    public static void playGame(){

        for(int i=0; i<5; i++){
            List<Integer>list;
            Lotto lotto = new Lotto();
            list = lotto.getArrayOne();
            //System.out.println(list);
            //System.out.println("sum: " + arraySum(list));
            String value = getInput(arraySum(list));
            if(Objects.equals(value, "correct")){
                break;
            }
        }
    }

    public static int arraySum(List<Integer> list){
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    public static String getInput(int sum){
        String value = "";
        JOptionPane.showMessageDialog(null, "Enter a number between 3 and 27");
        int answer = Integer.parseInt(JOptionPane.showInputDialog("Answer:"));
        if(answer == sum){
            value = "correct";
            JOptionPane.showMessageDialog(null, "Great Job!");
        }
        return value;

    }
}
