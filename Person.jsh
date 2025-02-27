git push;
person1.name
person1.age
person1.sayHello()
person1.name
person1.age
person1.sayHello()
person1.name
person1.age
person1.sayHello()
Person person1 = new Person("Alice", 25);
Person person2 = new Person("Bob", 30);
person1.name
person1.age
person1.sayHello()
class Person {
    String name;
    int age;

    // Constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Method to print person details
    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method to check if person is adult
    boolean isAdult() {
        return age >= 18;
    }

    // Method to have birthday
    void haveBirthday() {
        age = age + 1;
        System.out.println("Happy Birthday! " + name + " is now " + age);
    }
}
Person person = new Person("John", 17);
person.printDetails()
System.out.println(person.isAdult())
person.haveBirthday()
System.out.println(person.isAdult())