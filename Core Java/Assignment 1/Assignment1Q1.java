package JavaFiles;

import java.util.Scanner;

class ArmstrongOrNot {
    public boolean armstrongCheck(int num) {
    	int number=num;
    	int rem,result=0,count=0,num1=num;
    	while (num1 != 0) {
    	      num1 /= 10;
    	      ++count;
    	    }
    	while(num!=0)
    	{
    		rem=num%10;
    		result+=Math.pow(rem, count);
    		num/=10;
    	}
    	if(number==result)
    		return true;
    	else
    		return false;
    }

}

public class Assignment1Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		ArmstrongOrNot a=new ArmstrongOrNot();
		System.out.print(a.armstrongCheck(number)); 

	}

}
