import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Lotto {
    public List<Integer> list = new ArrayList<>();

    public Lotto() {

       for(int i=0; i<3; i++){
           Random random = new Random();
           list.add(random.nextInt(9));
       }
    }

    public List<Integer> getArrayOne() {
        return list;
    }
}
