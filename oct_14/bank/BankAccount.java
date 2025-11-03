public class BankAccount {
  private double balance;

  public BankAccount() {
    this.balance = 0;
  }

  public BankAccount(double balance) {
    this.balance = balance;
  }

  public void credit(double amt) {
    balance += amt;
  }

  public void debit(double amt) {
    balance -= amt;
  }

  public String checkBalance() {
    return String.format("%.2f", balance);
  }
}
