import java.util.Scanner;

public class OddNumberSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int n = sc.nextInt();
        System.out.println("Sum of odd number is : "+oddNumberSum(n));

    }

    private static int oddNumberSum(int n){
        System.out.println("Sum of all odd number till "+n+ " is: ");
        int sum=0;
        if(n < 2){
            return 1;
        }
        for(int i=1; i<n; i=i+2){
            sum = sum + i;
        }
        return sum;
    }
}
