package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
    private int id;
    private String name;
    private int age;
    private long salary;

    public Employee(int id, String name, int age, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
class EmpSort implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary() - o2.getSalary());
    }
}
public class ArrayListSortingExample {
    public static void main(String[] args) {
        List<Integer> list  =new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(40);
        System.out.println(list);

        Collections.sort(list); // default ASC sort
        System.out.println(list);

        Collections.reverse(list); // DESC sort
        System.out.println(list);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(10, "Veet", 20, 1200000));
        employees.add(new Employee(20, "Sanjay", 40, 1200));
        employees.add(new Employee(30, "Sunil", 20, 4500));
        employees.add(new Employee(40, "Rahul", 10, 12000));
        System.out.println(employees);

        Collections.sort(employees, new EmpSort());
        System.out.println(employees);

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.getSalary() - o1.getSalary());
            }
        });
        System.out.println(employees);

        Collections.sort(employees, (o1, o2)-> (int) (o2.getSalary() - o1.getSalary()));
        System.out.println(employees);

        Collections.sort(employees, (o1, o2)-> (int) (o1.getName().compareTo(o2.getName())));
        System.out.println(employees);

    }
}
