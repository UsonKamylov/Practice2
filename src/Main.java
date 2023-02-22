import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<User, BankAccount> map=new HashMap<>();
        User user=new User("uson","Kamylov");
        BankAccount bankAccount=new BankAccount(22500);
        bankAccount.AddBalance(10000);
        bankAccount.TakeMoney(2700);
        map.put(user,bankAccount);
        System.out.println(map);
        transaction(map,user,5000);
    }

    public static void transaction(Map<User,BankAccount>map,User user, int cache){
        map.put(user,new BankAccount(cache));
        System.out.println(map.get(user));
    }

}