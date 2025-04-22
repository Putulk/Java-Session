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

        int a[] = { 1, 2, 3, 1, 4, 2, 1, 5 };
        int n = a.length;
        Set<Integer> set1 = new HashSet<>();
        for(int i=0; i<n; i++){
            set1.add(a[i]);
        }
        System.out.println(set1);
    }
}
