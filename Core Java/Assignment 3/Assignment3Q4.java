package JavaFiles;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class DateClass {
    private int date;
    private int month;
    private int year;
    
    public DateClass(int date, int month, int year)
    {
    	this.date=date;
    	this.month=month;
    	this.year=year;
    }
    
    public int getDate()
    {
    	return this.date;
    }
    
    public int getMonth()
    {
    	return this.month;
    }
    
    public int getYear()
    {
    	return this.year;
    }
    
    public String getDOB()
    {
    	return this.date+"/"+this.month+"/"+this.year;
    }
    
    @Override 
    public int hashCode() { 
      final int number = 13; 
      int result = 3;
	  result = number * result + date; 
	  result = number * result + month; 
	  // result =prime * result + year; 
	  return result; }
	
	@Override 
	public boolean equals(Object obj) { 
      if (this == obj) 
    	  return true;
	  if (obj == null) 
		  return false; 
	  if (getClass() != obj.getClass()) 
		  return false; 
	  DateClass other = (DateClass) obj; 
	  if (date != other.date) 
		  return false; 
	  if (month != other.month) 
		  return false;  
	  if (year == other.year) 
		  return false;
		  
	  return true; 
	}
    
}

public class Assignment3Q4 {

    public String getEmployee(HashMap<DateClass, String> dob,String employeeName)
    {
    	String s="get method fails";
        
        for (Map.Entry<DateClass, String> entry : dob.entrySet()) {
        	System.out.println(entry.getValue());
        	System.out.println(employeeName);
            if(entry.getValue().equals(employeeName))
               { 
            	 s=entry.getValue();
            	 break;
               }
        }
        return s;
	}
    public static void main(String[] args) 
    {
    	Scanner scan=new Scanner(System.in);
    	HashMap<DateClass, String> dob = new HashMap<>();
    	DateClass one=new DateClass(28,2,1999);
    	DateClass two=new DateClass(14,6,1989);
    	DateClass three=new DateClass(28,3,1998);
    	DateClass four=new DateClass(14,6,1999);
    	
    	dob.put(one, "one");
    	dob.put(two,"two");
    	dob.put(three, "three");
    	dob.put(four, "four");
    	
        System.out.println("hashmap : "+dob);
        
        System.out.print("enter the name of employee you want to check : ");
        String name=scan.next();
        
        Assignment3Q4 answer=new Assignment3Q4();
        System.out.println("          "+answer.getEmployee(dob,name));
    }
}
