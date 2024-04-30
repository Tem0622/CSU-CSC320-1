package week2;

// week2.Child class definition
public class Child {
    private String fathersName;
    private String givenName;
    private int age;

    public Child(String fathersName, String givenName, int age) {
        this.fathersName = fathersName;
        this.givenName = givenName;
        this.age = age;
    }

    public String getFullName() {
        return fathersName + "ийн " + givenName;
    }

    public String getFathersName() {
        return fathersName;
    }

    public String getGivenName() {
        return givenName;
    }

    public int getAge() {
        return age;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
