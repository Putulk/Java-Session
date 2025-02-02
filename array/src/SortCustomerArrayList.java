import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortCustomerArrayList{

    public static void main(String[] args){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Alice", "New York", "Female"));
        customers.add(new Customer("Bob", "Los Angeles", "Male"));
        customers.add(new Customer("Charlie", "Chicago", "Male"));
        customers.add(new Customer("Diana", "Houston", "Female"));

        // Sort by name
        customers.sort(Comparator.comparing(Customer::getName));
        System.out.println("Sorted by name:");
        customers.forEach(System.out::println);

        // Sort by city
        customers.sort(Comparator.comparing(Customer::getCity));
        System.out.println("\nSorted by city:");
        customers.forEach(System.out::println);

        // Sort by gender, then by name
        customers.sort(Comparator.comparing(Customer::getGender).thenComparing(Customer::getName));
        System.out.println("\nSorted by gender, then by name:");
        customers.forEach(System.out::println);
    }
}

class Customer{
    private String name;
    private String city;
    private String gender;
    public Customer(String name,String city,String gender){
        this.name=name;
        this.city=city;
        this.gender=gender;
    }

    // Getters
    public String getName(){
        return name;
    }

    public String getCity(){
        return city;
    }

    public String getGender(){
        return gender;
    }

    @Override
    public String toString(){
        return "Customer{"+
                "name='"+name+'\''+
                ", city='"+city+'\''+
                ", gender='"+gender+'\''+
                '}';
    }
}