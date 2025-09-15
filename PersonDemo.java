
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Gyandeep Duwarah", 21);
        Person person2 = new Person("himangshu singh", 23);
        System.out.println("1st person Name:-" + person1.name);
        System.out.println("1st person Age:-" + person1.age);
        System.out.println("2nd person Name:-" + person2.name);
        System.out.println("2nd person Age:-" + person2.age);
    }
}
