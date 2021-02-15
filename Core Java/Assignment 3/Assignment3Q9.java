package JavaFiles;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Assignment3Q9 {
    public static void main(String[] args) {
        
        TreeSet<SavingAccount> savingAccounts = new TreeSet<>(Comparator.comparing(SavingAccount::getAcc_ID));
        Scanner scan= new Scanner(System.in);
        
        savingAccounts.add(new SavingAccount(30.0,3,"h1",true));
        savingAccounts.add(new SavingAccount(25.0,2,"h2",false));
        
        BankAccountList b =new BankAccountList(savingAccounts);
        
        System.out.print("Enter the number of savings accounts : ");
        int number=scan.nextInt();

        for (int i=0;i<number;i++){

            System.out.print("Enter the account ID              : ");
            int id=scan.nextInt();
            
            System.out.print("Enter the account balance         : ");
            double account=scan.nextDouble();

            System.out.print("Enter the account holder name     : ");
            String name=scan.next();

            System.out.print("Enter is it salary account or not : ");
            boolean accType=scan.nextBoolean();

            b.addSavingAccount(new SavingAccount(account,id,name,accType));
        }
        
        b.displaySavingAccountIds().forEach(f -> System.out.println(f));

    }
}


class SavingAccount {

    private double acc_balance;
    private int acc_ID;
    private String accountHolderName;
    private boolean isSalaryAccount;
    
    public SavingAccount(double acc_balance, int acc_ID, String accountHolderName, boolean isSalaryAccount) {
        super();
        this.acc_balance = acc_balance;
        this.acc_ID = acc_ID;
        this.accountHolderName = accountHolderName;
        this.isSalaryAccount = isSalaryAccount;
    }
    
    public int getAcc_ID() 
    {
    	return acc_ID;
    }
}


class BankAccountList{

    private TreeSet<SavingAccount> savingAccounts = new TreeSet<>(Comparator.comparing(SavingAccount::getAcc_ID));
    
    public BankAccountList() 
    {
        super();
        
    }

    public BankAccountList(TreeSet<SavingAccount> savingAccounts) 
    {
    	this.savingAccounts = savingAccounts;
   	}
    
    int  a= savingAccounts.size();

    public boolean addSavingAccount(SavingAccount savingAccount) {
        savingAccounts.add(savingAccount);
        int b= savingAccounts.size();
        if (b==a) 
        	return false;
        return true;
    }

    public List<Integer> displaySavingAccountIds() {
        List<Integer> list = new ArrayList<>(); 
        savingAccounts.stream().forEach(e -> list.add(e.getAcc_ID()));
        return list;
    }
}
