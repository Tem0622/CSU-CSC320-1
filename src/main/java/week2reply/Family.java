package week2reply;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Family {
    private static int nextFamilyId = 1;  // Static variable for incrementing family ID
    private final int familyId;
    private List<Child> children;

    // Constructor for Family class
    public Family() {
        this.familyId = nextFamilyId++;
        this.children = new ArrayList<>();
    }
    // adds a child to the family
    public void addChild(String firstName, String lastName, short age, LocalDate dob, Gender gender) {
        children.add(new Child(firstName, lastName, age, dob, gender));
    }
    // Getters
    public int getFamilyId() {
        return familyId;
    }
    public List<Child> getChildren() {
        return new ArrayList<>(children);  // Return a copy of the children list
    }
    // Nested Child class
    static class Child {
        private String firstName;
        private String lastName;
        private short age;
        private LocalDate dateOfBirth;
        private Gender gender;
        // Constructor for Child class
        public Child(String firstName, String lastName, short age, LocalDate dob, Gender gender) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.dateOfBirth = dob;
            this.gender = gender;
        }
        // Getters
        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public short getAge() {
            return age;
        }
        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }
        public Gender getGender() {
            return gender;
        }
    }
    // Gender enumeration
    public enum Gender {
        MALE, FEMALE, OTHER
    }
}