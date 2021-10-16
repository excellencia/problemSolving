package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(23);
        list.add(45);
        list.add(6);

        list.stream().filter(num -> num > 10).forEach(System.out::println);
        System.out.println("----------------------------");
        list.stream().forEach(s -> System.out.println(s));

        System.out.println("----------------------------");

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Dave", 23));
        personList.add(new Person("Joe", 18));
        personList.add(new Person("Ryan", 54));
        personList.add(new Person("Iyan", 5));
        personList.add(new Person("Ray", 63));
        personList.stream().filter(person -> person.getAge() > 18 && person.getAge() < 60).forEach(person -> System.out.println(person.getName()));

        System.out.println("---------------Mapping Demo-------------");

        List<String> stringList = new ArrayList<>();
        stringList.add("Ravi");
        stringList.add("Sheya");
        stringList.add("Shlok");
        stringList.add("Rohit");
        stringList.add("Mohit");

        stringList.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
        System.out.println("--------------Length of the name--------------");
        stringList.stream().mapToInt(name -> name.length()).forEach(System.out::println);

        System.out.println("---------------Flat Maps Demo-------------");
        List<List<String>> listList = new ArrayList<>();
        listList.add(Arrays.asList("a","b","c"));
        listList.add(Arrays.asList("d","e","f"));
        listList.add(Arrays.asList("g","h","i"));
        listList.add(Arrays.asList("j","k","l"));

        listList.stream()
                .flatMap(s -> s.stream())
                .filter(x ->"a".equals(x))
                .forEach(System.out::println);


    }


}
