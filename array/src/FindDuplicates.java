import java.util.*;

public class FindDuplicates{
    public static void main(String[] args){
        FindDuplicates findDuplicates = new FindDuplicates();
        int[] arr = new int[]{3,1, 0, 4, 2, 1};
        System.out.println("Duplicates list: "+findDuplicates.findDuplicatesInArr(arr));
    }

    public List<Integer> findDuplicatesInArr(int[] arr) {
        int n= arr.length;
        List<Integer> list = new ArrayList<>();

        // Optimized in O(n)
        Set<Integer> dup = new HashSet<>();
        Set<Integer> set= new HashSet<>();
        for(int num:arr){
            if(!dup.add(num)){
                set.add(num);
            }
        }

        list.addAll(set);
        Collections.sort(list);
        return list;

    }

}
