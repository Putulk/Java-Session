import java.util.Arrays;

public class CyclicRotation{
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,0};
        CyclicRotation c = new CyclicRotation();
        System.out.println("Cyclic rotation array by one: "+Arrays.toString(c.cyclicRotationByOne(arr)));
    }
    public int[] cyclicRotationByOne(int[] arr){
        int n=arr.length;
        int tmp = arr[0];
        int[] b = new int[n];

        for(int i=0; i<n-1; i++){
            b[i]= arr[i+1];
            b[n-1] = tmp;
        }
        return b;
    }
}
