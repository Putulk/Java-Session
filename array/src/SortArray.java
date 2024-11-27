import java.util.Arrays;

public class SortArray{
    public static void main(String[] args){

        int[] a = new int[]{12,1,4,8,3,0};
        SortArray array = new SortArray();
        System.out.println(Arrays.toString(array.sorting(a)));
    }

    public int[] sorting(int[] arr){
        int n= arr.length;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
