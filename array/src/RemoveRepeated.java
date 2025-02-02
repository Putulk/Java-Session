import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RemoveRepeated{
    public static void main(String[] args){
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        Collections.addAll(integerArrayList, 3,1, 0, 4, 2, 3, 1, 3);

        Set<Integer> set = new HashSet<>();
        set.addAll(integerArrayList);
        System.out.println(set);
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(set);
        System.out.println("After removing duplicates: "+result);
    }
}
