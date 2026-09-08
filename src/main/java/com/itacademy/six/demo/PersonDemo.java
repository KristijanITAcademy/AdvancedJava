package com.itacademy.six.demo;

import java.sql.Connection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Collection API
 * <li>
 *     1.Consumer<E>
 *     void accept(E element)
 *     </li>
 *     <li>
 *         2. Function <T ,R>
 *             R apply(T taken);
 *     </li>
 *     <li>
 *         3. Predicate<E> - > tester
 *         boolean test (E element)
 *     </li>
 *     <li>
 *         4. Supplier<E>
 *             E get();
 *     </li>
 */
public class PersonDemo {
    public static void main(String[] args) {

        PersonReader personReader = new PersonReader();
        List<Person> personList = personReader.readPersons("persons.csv");
            personList.stream()
                    .filter(p ->p.getGender().equals(Gender.FEMALE))
                    .forEach(p-> System.out.println(p));

    }
}








//  Consumer<Person>personConsumer = person -> System.out.println(person);
//  Function<Person, String> personToNameMapper = person -> person.getName();
//  iteriraj kroz person listu i za svaku listu uzmi taj perso
//   element i poslji ga na out
//        personList.forEach(person -> System.out.println(person));// lambda samo poziva metodu
//        personList.forEach(System.out::println);
//        personList.forEach(personConsumer);
//        for (Person person : personList) {
//            System.out.println(person);
//        }
