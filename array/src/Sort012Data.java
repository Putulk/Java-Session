import java.util.Arrays;

public class Sort012Data{
    public static void main(String[] args){
        int[] arr = new int[]{0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        System.out.println(Arrays.toString(sort012(arr)));
    }

    public static int[] sort012(int[] arr) {
        int n=arr.length;
        int cnt0=0, cnt1=0, cnt2=0;
        for(int j: arr){
            if(j==0){
                cnt0++;
            }else if(j==1){
                cnt1++;
            }else{
                cnt2++;
            }
        }

        int index = 0;
        for(int i=0; i<cnt0; i++){
            arr[index++] = 0;
        }
        for(int i=0; i<cnt1; i++){
            arr[index++] = 1;
        }
        for(int i=0;i<cnt2; i++){
            arr[index++] = 2;
        }
        return arr;
    }
}
