import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int n = sc.nextInt();
        multiplicationTable(n);

    }

    public static void multiplicationTable(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n +"*" + i +"=" +i*n);
        }
    }
}
