import java.util.Scanner;

public class FactorialOfNumber{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the factorial calculation...");
        System.out.print("Enter a number to calculate factorial: ");
        int num = scanner.nextInt();
        System.out.println("Factorial of n is: "+factorialOfNum(num));
    }

    public static int factorialOfNum(int n){
        int fact = 1;
        if(n <= 1){
            fact = 2;
        }
        for(int i=n; i>=1; i--){
            fact = fact * i;
        }
        return fact;
    }
}
