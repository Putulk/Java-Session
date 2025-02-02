public class MethodOverloading{

    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args){
        MethodOverloading methodOverloading = new MethodOverloading();
        System.out.println("Two params: "+methodOverloading.add(20, 30));
        System.out.println("Three params: "+methodOverloading.add(20,30,40));
    }
}
