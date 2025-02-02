import java.util.Arrays;

public class ArrayPractice{
    public static void main(String[] args){
        int[] a = { 1, 8, 3 };
        int n = 3;
        System.out.println("\n\nReverse of the array: {}"+Arrays.toString(copyAndReverse(a,n)));
        System.out.println("\n\nSort in decreasing order: {}"+Arrays.toString(sortArray(a,n)));
    }

    public static int[] copyAndReverse(int[] arr, int n) {
        int[] b = new int[n];
        b = arr;

        System.out.println("Contents of a[] ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println("\n\nContents of b[] ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");

        int[] res = new int[n];
        for(int i=0; i<n; i++){
            res[i] = b[n-1-i];
        }
        return res;
    }

    public static int[] sortArray(int a[], int n)
    {
        int temp;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        int[] inc = new int[n];
        System.out.println("\n\nArray in increasing order: {}");
        for(int i=n-1; i>=0; i--){
            inc[i] = a[i];
            System.out.println(inc[i] + " ");
        }
        int[] res = new int[n];
        for(int i=0; i<a.length; i++){
            res[i] = a[i];
        }
        return res;
    }
}