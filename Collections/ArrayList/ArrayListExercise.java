package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExercise {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Alex", 23, "USA"));
        list.add(new Employee("Dave", 34, "India"));
        list.add(new Employee("Carl", 21, "USA"));
        list.add(new Employee("Joe", 56, "Russia"));
        list.add(new Employee("Amit", 64, "China"));
        list.add(new Employee("Ryan", 19, "Brazil"));

        Collections.sort(list,(emp1, emp2) -> emp1.country.compareTo(emp2.country));

        for(Employee emp : list){
            if(emp.age > 50){
                System.out.println("Employee aged over 50 "+emp.name);
            }
           /* if(emp.country.equalsIgnoreCase("USA"))
                System.out.println("Employees from USA "+emp.name);*/
            //System.out.println("Employee Country:"+emp.country+", Employee Name:"+emp.name);
        }
        Iterator<Employee> itr = list.iterator();
        while (itr.hasNext()){
            if(itr.next().country.equals("USA"))
                itr.remove();
        }
        for (Employee emp : list) {
            System.out.println("Employee Name: " + emp.name + ", Employee Country: " + emp.country);
        }
    }
}
