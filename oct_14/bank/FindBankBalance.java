public class FindBankBalance {
  public static void main(String[] args) {
    BankAccount bankAcc = new BankAccount();
    
    System.out.println("Bank Balance: " + bankAcc.checkBalance());

    System.out.println("Credit +120.45");
    bankAcc.credit(120.45);

    System.out.println("Debit -60");
    bankAcc.debit(60);

    System.out.println("Bank Balance: " + bankAcc.checkBalance());
  }
}
