package com.itacademy.seven;

import com.itacademy.four.io.writer.Writer;
import com.itacademy.four.io.writer.WriterType;
import com.itacademy.six.demo.Gender;
import com.itacademy.six.demo.Person;
import com.itacademy.six.demo.PersonReader;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * File je na neki nacin kolekcija podataka, baza podataka
 * Lambda operator -> FunctionalInterface
 * MethodReferencing
 * Conccurency
 *
 * Sto je o funkcionalni interface ?
 * Potreban i dovoljan uslov da bude fuctional je da ima jednu i samo jednu abstract metodu
 * funkcija ima rezultat koji
 *
 * LAMBDA
 *  -> {} - ako ima samo jedn metodu i nema bloka koda, ja cu definirat njen blok koda kaze lambda
 *      - moze se koristit kao shorcut za kreiramke objekata TIPA funkcionalnog interfacea
 *      - kad lambda definira blok koda abstract metode ta metoda vise nije abstract
 *
 *
 * <>
 *     Sto je abstract metoda?
 *      - nema blok koda
 *      - rezultat ima
 *      - ima input parametara 0 ili n
 *     Sto je metoda ili funkcija
 *          - blok koda koji se izvrsava kad neko pozove metodu
 *          - ima rezultat koji moze biti void(praznina) ili nekog tipa rezultat, int, float,
 *          double, Person, List<Person>
 *          - moze imati input parametre -> neogranicen ali savjet je max 3
 *
 *
 * </>
 */
public class Demo {
    public static void main(String[] args) {

        PersonReader personReader = new PersonReader();
        List<Person> personList = personReader.readPersons("persons.csv");
//        printPersons(personList);
//        genericPrint(personList, p->true );
//        genericPrint(personList, person -> person.getAge()>45);
//        Predicate<Person> tester = person -> person.getAge() < 24;
//        genericPrint(personList, tester);
//        tester.test(new Person());
//        Predicate<Person> tester = person -> person.getAge() >= 30 && person.getAge() <= 40;
//        genericPrint(personList, tester);
        Writer writer = WriterType.LINE.getWriter();

        Predicate<Person> testerPerson = person -> Gender.MALE.equals(person.getGender());
        Function<Person, String> personTransfomer = person -> person.getName() + " " + person.getSurname();
        Consumer<String> personConsumer = person -> System.out.println(person);

        personList
                .stream()
                .filter(testerPerson)
                .map(personTransfomer)
                .forEach(personConsumer);

//          genericPrint(personList, testerPerson, personTransfomer, personConsumer);

//        genericPrint(
//                personList,
//                person -> Gender.FEMALE.equals(person.getGender()),
//                person -> writer.write("person.txt", person.toString())
//        );


    }


    private static void genericPrint(Collection<Person> personCollection,
                                     Predicate<Person> personTester,
                                     Function<Person, String> personTransformer,
                                     Consumer<String> personConsumer) {


        for (Person person : personCollection) {
            //ako prodes test u konzoli si ako ne prodes nisi
            //testira person varijablu u kolekciji
            if (personTester.test(person)) {
                String personTextResult = personTransformer.apply(person);
//                //konzumiramo onog ko je prosao test
//              personConsumer.accept(personTextResult);
            }
        }
    }
}


//    private static void printPersons(Collection<Person> personCollection){
//        for (Person person: personCollection){
//            System.out.println(person);


