public class MemoryDemo {
    public static void main(String[]args){
        int balance = 1000;
        int copy = balance;

        copy = 500;
        System.out.println("balance: " + balance);
        System.out.println("copy " + copy);

       
      BankAccount acc1 = new BankAccount();
      acc1.balance = 1000;

      BankAccount acc2 = acc1;
      acc2.balance = 500;

      System.out.println("acc1: " + acc.balance);
      System.out.println("acc2: " + acc.balance);

    }
    
}
