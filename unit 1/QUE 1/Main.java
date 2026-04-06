package Question_1;

// Question 1: Create a class called Person with name (String) and age (int) attributes.
// Implement a constructor to set these attributes upon object creation.
// Create two Person objects, set their details, and print them.

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Person p1 = new Person("Dushant", 18);
        Person p2 = new Person("Omkar", 19);

        System.out.println(p1);
        System.out.println(p2);
    }
}

// Output:
// Name: Alice, Age: 30
// Name: Bob, Age: 25