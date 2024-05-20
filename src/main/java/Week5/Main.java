package Week5;

public class Main {

    public static void main(String[] args) {

        // Array to store Person objects
        Person[] people = {
                new Person(60, "Democrat", "Jeff"),
                new Person(61, "Independent", "Tim"),
                new Person(62, "Republican", "Bill")
        };

        // Print info
        printInfo("Results:\n", people);
    }

    // Generic method to print info
    static void printInfo(String label, Person[] people) {
        System.out.print(label);
        for (Person person : people) {
            System.out.println("Age: " + person.age + ", Party: " + person.party + ", Name: " + person.name);
        }
    }
}

class Person {
    Integer age;
    String party;
    String name;

    Person(Integer age, String party, String name) {
        this.age = age;
        this.party = party;
        this.name = name;
    }
}
