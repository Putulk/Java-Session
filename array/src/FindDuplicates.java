import java.util.*;

public class FindDuplicates{
    public static void main(String[] args){
        FindDuplicates findDuplicates = new FindDuplicates();
        int[] arr = new int[]{3,1, 0, 4, 2, 3, 1};
        System.out.println("Duplicates list: "+findDuplicates.findDuplicatesInArr(arr));
    }

    public List<Integer> findDuplicatesInArr(int[] arr) {
        int n= arr.length;
        List<Integer> list = new ArrayList<>();
        // In O(n^2)
//        for(int i=0; i<n-1; i++){
//            for(int j=i+1; j<n; j++){
//                if(arr[i]==arr[j]){
//                    list.add(arr[j]);
//                    Collections.sort(list);
//                }
//            }
//        }

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
