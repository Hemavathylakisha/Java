package Java8;

import java.util.Optional;

class Person {
    private String name;
    private Bike bike;

    public Person(String name, Bike bike) {
        this.name = name;
        this.bike = bike;
    }

    public String getName() {
        return name;
    }

    public Optional<Bike> getBike() {
        return Optional.ofNullable(bike);
    }
}

class Bike {
    private String bikename;

    public Bike(String bikename) {
        this.bikename = bikename;
    }

    public String getBikename() {
        return bikename;
    }
}

public class OptionalClassDemo {

    // Utility method using Optional chaining
    public static String getBikeName(Person person) {

        return Optional.ofNullable(person)          // Person may be null
                .flatMap(Person::getBike)           // Bike may be null
                .map(Bike::getBikename)              // get bike name
                .orElse("No Bike Assigned");          // default value
    }

    public static void main(String[] args) {

        Person joyal = new Person("Joyal", new Bike("KTM"));
        System.out.println(getBikeName(joyal));

        Person k7 = new Person("k7", null);
        System.out.println(getBikeName(k7));

        Person unknown = null;
        System.out.println(getBikeName(unknown));
    }
}
