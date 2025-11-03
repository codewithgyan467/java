class Person {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

public class PersonDetails {
  public static void main(String[] args) {
    Person person1 = new Person(
      "Priyanuj Gogoi",
      21
    );

    Person person2 = new Person(
      "John Doe",
      35
    );

    System.out.println("1st Person Name: " + person1.name);
    System.out.println("1st Person Age: " + person1.age);

    System.out.println("2nd Person Name: " + person2.name);
    System.out.println("2nd Person Age: " + person2.age);
  }
}
