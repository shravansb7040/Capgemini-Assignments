package JavaFiles;

import java.util.Scanner;

class TaxAmount{
    public double calculateTaxAmount(int ctc){
    	double tax=0.0d;
    	if(ctc>0 && ctc<180000)
    	{
    		tax=0; 
    	}
    	else if(ctc>180000 && ctc<300000)
    	{
    		tax=0.1*(ctc);
    	}
    	else if(ctc>300000 && ctc<500000)
    	{
    		tax=0.2*(ctc);
    	}
    	else if(ctc>500000 && ctc<1000000)
    	{
    		tax=0.3*(ctc);
    	}
    	return tax;
    }
}
public class Assignment1Q5 {
    public static void main(String args[]) {
    	int ctc;
    	Scanner scan=new Scanner(System.in);
    	ctc=scan.nextInt();
    	TaxAmount tax=new TaxAmount();
    	System.out.println(tax.calculateTaxAmount(ctc));
    }
}
