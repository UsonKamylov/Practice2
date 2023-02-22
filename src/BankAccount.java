public class BankAccount {
    private int Balance;

    public BankAccount(int balance) {
        Balance = balance;
    }

    public BankAccount() {
    }

    public void AddBalance(int san){
        int count=san+getBalance();
        System.out.println(count);
        count++;

    }
    public void TakeMoney(int sum){
        int summ=getBalance()-sum;
        System.out.println(summ);
        summ--;


    }

    public int getBalance() {
        return Balance;
    }
    public void setBalance(int balance) {
        Balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "Balance=" + Balance +
                '}';
    }
}
