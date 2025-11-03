public class Book {
  private String title;
  private String author;
  private String isbn;
  private int price;

  Book(String title, String author, String isbn, int price) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public String getIsbn() {
    return isbn;
  }

  public int getPrice() {
    return price;
  }

  public void setTitle(String newTitle) {
    title = newTitle;
  }

  public void setAuthor(String newAuthor) {
    author = newAuthor;
  }

  public void setIsbn(String newIsbn) {
    isbn = newIsbn;
  }

  public void setPrice(int newPrice) {
    price = newPrice;
  }

  @Override
  public String toString() {
    return "Book(title=" + title + ", author=" + author + ", isbn=" + isbn + ",price= " + price + ")";
  }
}
