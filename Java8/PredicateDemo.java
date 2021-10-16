package Java8;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateDemo {
    static boolean isPersonEligibleForVoting(Person person, Predicate<Person> personPredicate){
        return personPredicate.test(person);
    }

    static boolean isPersonEligibleForVoting(Supplier<Person> supplier, Predicate<Person> predicate){
        return predicate.test(supplier.get());
    }
    static boolean isPersonEligibleForClubMembership(Person person, Predicate<Person> predicate){
        return predicate.test(person);
    }

    public static void main(String[] args) {
        Person person = new Person("Ravi",19);
        Supplier<Person> supplier = ()-> new Person("Alex", 23);
        Predicate<Person> predicate = person1 -> person1.getAge() > 18;
        System.out.println(isPersonEligibleForVoting(supplier,predicate));



        boolean eligible = isPersonEligibleForVoting(person,predicate);
        System.out.println(eligible);

        Predicate<Person> personPredicate1 = person1 -> person1.getAge() > 18;
        Predicate<Person> personPredicate2 = person1 -> person1.getAge() < 60;
        Predicate<Person> personPredicate = personPredicate1.and(personPredicate2);
        System.out.println(isPersonEligibleForClubMembership(person,personPredicate));
    }
}
