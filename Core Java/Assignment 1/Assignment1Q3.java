package JavaFiles;

import java.util.Scanner;

class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
    	double interest = (principalAmount * time * interestRate) / 100;
    	return interest;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
    	double interest = principalAmount * (Math.pow((1 + interestRate/100), (time))) - principalAmount;
    	return interest;
    }
}
public class Assignment1Q3 {
    public static void main (String args[]) {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("Principal Amount: ");
    	int principalAmount=scan.nextInt();
    	System.out.print("Time: ");
    	int time=scan.nextInt();
    	System.out.print("Interest Rate: ");
    	int interestRate=scan.nextInt();
    	SiCi si=new SiCi();
    	double SI=si.simpleInterest(principalAmount, time, interestRate);
    	double CI=si.compoundInterest(principalAmount, time, interestRate);
    	System.out.println("Simple Interest: "+SI+"\n"+"Compund Interest: "+CI);
    	
    }
}
