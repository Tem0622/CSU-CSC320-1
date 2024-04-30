package week2reply;

import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Family family = new Family();
        family.addChild("John", "Doe", (short)10, LocalDate.of(2013, 3, 15), Family.Gender.MALE);
        family.addChild("Jane", "Doe", (short)8, LocalDate.of(2015, 6, 21), Family.Gender.FEMALE);

        System.out.println("Family ID: " + family.getFamilyId());
        for (Family.Child child : family.getChildren()) {
            System.out.println("Child: " + child.getFirstName() + " " + child.getLastName() +
                    ", Age: " + child.getAge() +
                    ", DOB: " + child.getDateOfBirth() +
                    ", Gender: " + child.getGender());
        }
    }
}
