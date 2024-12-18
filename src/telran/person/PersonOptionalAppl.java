package telran.person;

import telran.person.model.Person;
import telran.person.model.PersonNotFoundException;

import java.util.Optional;

public class PersonOptionalAppl {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("John", 28),
                new Person("Mary", 19),
                new Person("Peter", 25)
        };
        Optional<Person> optional = findPersonByAge(persons, 25);
//        if(optional.isPresent()) {
//            Person person = optional.get();
//            System.out.println(person.getName());
//        }

//        optional.ifPresent(p -> System.out.println(p.getName()));

//        Person person = optional.orElse(new Person("Anonymous", -1));

//        Person person = optional.orElseGet(() -> new Person("Anonymous", -1));

        Person person = optional.orElseThrow(() -> new PersonNotFoundException());

        System.out.println(person.getName());

    }

    private static Optional<Person> findPersonByAge(Person[] persons, int age) {
        Person res = null;
        for (var person : persons) {
            if (person.getAge() == age) {
                res = person;
                break;
            }
        }
        return Optional.ofNullable(res);
    }
}
