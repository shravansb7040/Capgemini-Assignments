package JavaFiles;

import java.util.Scanner;

interface Add
{
	public double addition(int num1,int num2);
}

interface Sub
{
	public double subtraction(int num1,int num2);
}

interface Multi
{
	public double multiplication(int num1,int num2);
}

interface Div
{
	public double division(int num1,int num2);
}
public class Assignment4Q1 {
    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	
    	int a,b;
    	a=scan.nextInt();
    	b=scan.nextInt();
    	
    	Add Addition=(int x, int y)->{ return x+y; };
		System.out.println(Addition.addition(a,b));
		
		Sub Subtraction=(int x, int y)->{ return x-y; };
		System.out.println(Subtraction.subtraction(a, b));
		
		Multi Multiplication=(int x, int y)->{ return x*y; };
		System.out.println(Multiplication.multiplication(a, b));
		
		Div Division=(int x, int y)->{ return (double)x/y;};
		System.out.println(Division.division(a, b));
    }
}
