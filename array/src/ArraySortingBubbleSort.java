import java.util.ArrayList;
import java.util.Iterator;

public class ArraySortingBubbleSort{
    public static void main(String[] args){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Putul", 26, 40000));
        employees.add(new Employee("Aman", 28, 60000));
        employees.add(new Employee("Shabu", 25, 50000));
        employees.add(new Employee("Harpreet", 35, 45000));
        employees.add(new Employee("Ashutosh", 28, 100000));

        System.out.println("\nBefore Sorting: >>>>>>>>");
        for (Employee emp : employees) {
            System.out.print("Salary: "+emp.getSalary() +" Age: "+emp.getAge()+" Name: "+ emp.getName());
        }
        employees.forEach(employee -> {
            employee.getAge();
        });

        for(int i=0; i<employees.size(); i++){
            for(int j=0; j<employees.size()-1-i; j++){
                if(employees.get(j).getSalary() > employees.get(j+1).getSalary()){
                    Employee employee = employees.get(j);
                    employees.set(j, employees.get(j+1));
                    employees.set(j+1, employee);
                }
            }
        }
        System.out.println("\nAfter sorting: >>>>>>>>>>>");
        for (Employee emp : employees) {
            System.out.print("Salary: "+emp.getSalary() +" Age: "+emp.getAge()+" Name: "+ emp.getName());
        }
    }
}

class Employee{
    String name;
    int age;
    int salary;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }

    public Employee(String n,int a,int s){
        this.age=a;
        this.name=n;
        this.salary=s;
    }
}
