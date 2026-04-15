package arrylist;
import java.util.ArrayList;
import java.util.Collections;
public class Arraylist_10 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        Collections.sort(numbers);
        for(int i = 0; i < numbers.size();i++){
            System.out.println(numbers.get(i));
        }
    }
}
