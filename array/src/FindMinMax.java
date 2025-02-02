public class FindMinMax{
//    Find the Minimum and Maximum Element in an Array

    public static void main(String[] args){
        int[] arr = new int[]{10,20,40, 80, 100, 1100, 87346};
        FindMinMax minMax = new FindMinMax();

        System.out.println("\nMin element of array: "+minMax.findMin(arr));
        System.out.println("\nMax element of array: "+minMax.findMax(arr));
    }

    public int findMin(int[] arr){
        int n=arr.length;
        int min = Integer.MIN_VALUE;


        for(int j: arr){
            if(min<=j){
                min=j;
            }
        }
        return min;
    }

    public int findMax(int[] arr){
        int n=arr.length;
        int max = Integer.MAX_VALUE;


        for(int j: arr){
            if(max>=j){
                max=j;
            }
        }
        return max;
    }
}
