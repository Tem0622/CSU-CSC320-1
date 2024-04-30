package week2;

public class MonName {
    public static void main(String[] args) {
        // Create an instance of the week2.Child class
        Child child = new Child("Цогтгэрэл", "Тэмүүжин", 30);

        // Print the full name and age of the child
        System.out.println("Full Name: " + child.getFullName());
        System.out.println("Age: " + child.getAge());
    }
}
