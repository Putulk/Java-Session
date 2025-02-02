import java.util.Arrays;

public class ArrayReverse{

    public static void main(String[] args){
        int[] arr = new int[]{10,20,40, 80, 100, 1100, 87346};
        ArrayReverse arrayReverse = new ArrayReverse();
        System.out.println("Reverse of array: "+Arrays.toString(arrayReverse.revArray(arr)));
    }

    public int[] revArray(int[] arr){
        int n=arr.length;
        int[] res = new int[n];

        for(int i=0; i<n; i++){
            res[i] = arr[n-1-i];
        }
        return res;
    }
}
