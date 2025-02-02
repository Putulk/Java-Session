import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class ArrayListExercise{
    /*Write a Java program to create an array list, add some colors (strings) and print out the collection.*/
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        List<String> colorList = new ArrayList<>();
        colorList.add("Black");
        colorList.add("Blue");
        colorList.add("Purple");
        colorList.add("White");
        colorList.add("Green");
        System.out.println("Arraylist with color: "+colorList);

        /* Write a Java program to iterate through all elements in an array list.*/

        Iterator iterator = colorList.iterator();
        System.out.println("Iterating elements using iterator: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        /* Write a Java program to insert an element into the array list at the first position. */
        colorList.add("Orange");
        System.out.println("List after adding element at first position: ");
        System.out.println(colorList);
    }
}
