public class Main {
  public static void main(String[] args) {
    Book book = new Book(
      "Java: The Complete Reference Ninth Edition",
      "Herbert Schildt",
      "978-0749467241",
      1450
    );

    System.out.println(book);

    book.setTitle("Compilers: Principles, Techniques, and Tools");
    book.setAuthor("Alfred V. Aho");
    book.setIsbn("0-201-10088-6");
    book.setPrice(8019);

    System.out.println(book);
  }
}
