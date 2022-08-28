package Inheritance;

public class Person {
    String firstName;
    String lastName;
    //default constructors
    public Person() {
       firstName = "";
       lastName = "";
    }
    //alternate constructors
    public Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String firstName() {
        return firstName;
    }
    public String lastName() {
        return lastName;
    }
    public void printLastName() {
        System.out.print(lastName + " " + lastName);
    }
    public void print() {
        System.out.print(lastName + " " + firstName);
    }
    public String toString() {
        return (" " + firstName + " " + lastName);
    }
    public boolean equals(Object obj) {
        Person person2 = getPerson(obj);
        if (person2 == null) {
            return false;
        }
        else {
            return firstName == person2.firstName && lastName == person2.lastName;
        }
    }
    public void copy(Object obj ) {
        Person person = getPerson(obj);
        if (person != null) {
            firstName = person.firstName;
            lastName = person.lastName;
        }
    }
    public Person getCopy() {
        return new Person(firstName, lastName);
    }
    public Person getPerson(Object obj) {
        return (obj == null || !(obj instanceof Person)) ? null: (Person) obj;
    }
}
